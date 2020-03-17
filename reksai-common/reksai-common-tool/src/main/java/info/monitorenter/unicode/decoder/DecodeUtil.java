/*
 * DecodeUtils.java, <purpose>
 *
 * Copyright 2007 (C) Achim Westermann,
 * created on 12.05.2007 14:51:43.
 *
 * ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this collection are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is the cpDetector code in [sub] packages info.monitorenter and
 * cpdetector.
 *
 * The Initial Developer of the Original Code is
 * Achim Westermann <achim.westermann@gmx.de>.
 *
 * Portions created by the Initial Developer are Copyright (c) 2007
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK *****
 *
 * If you modify or optimize the code in a useful way please let me know.
 * Achim.Westermann@gmx.de
 *
 */

package info.monitorenter.unicode.decoder;

import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStreamException;
import info.monitorenter.cpdetector.util.FileUtil;
import info.monitorenter.unicode.decoder.html.HtmlEntityDecoder;
import info.monitorenter.unicode.decoder.html.HtmlEntityDecoderReader;
import info.monitorenter.unicode.decoder.html.HtmlEntityLexer;
import jargs.gnu.CmdLineParser;
import jargs.gnu.CmdLineParser.IllegalOptionValueException;
import jargs.gnu.CmdLineParser.Option;
import jargs.gnu.CmdLineParser.UnknownOptionException;

import java.io.*;


/**
 * Easy to use utility functions with scope on decoding to unicode.
 * <p>
 * <p>
 * Be careful with the methods that work on String data (vs. Streams): Large
 * documents will cause an <code>{@link OutOfMemoryError}</code>.
 * <p>
 *
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * @version $Revision: 1.10 $
 */
public final class DecodeUtil {

    /**
     * Utility class construtor.
     * <p>
     */
    private DecodeUtil() {

        // nop as stateless
    }

    /**
     * Decodes <tt>HTML Entities</tt>(e.g. &amp;nbsp;) in the given String into
     * the unicode representation.
     * <p>
     * <p>
     * This method should perform quick as an <a href="http://www.antlr.org"
     * target="_blank">ANTLR</a> generated parser is used.
     * <p>
     * <p>
     * HTML entities are described in <a
     * href="http://www.w3.org/TR/html401/sgml/entities.html">
     * http://www.w3.org/TR/html401/sgml/entities.html</a>
     * <p>
     * <p>
     * For enterprise support of arbitrary large files prefer the approach of
     * <code>{@link HtmlEntityDecoderReader}</code>.
     * <p>
     *
     * @param html      the html data to decode <tt>HTML Entities</tt> in.
     * @param recursive if true the input will be processed until there are no character
     *                  entity references contained any more (decoding &amp;ouml; will
     *                  produce &ouml;).
     * @return a new String with the unicode representation of the HTML Entities
     * in the input html.
     * @throws IOException          if sth. goes wrong.
     * @throws TokenStreamException if invalid character data was found in the underlying stream.
     *                              This is unlikely to happen as the lexer covers all characters,
     *                              but if it should happen (ANTLR error?) this method cannot deal
     *                              with the problem and does not catch the exception.
     * @throws RecognitionException if invalid format was found in the given html. This is unlikely
     *                              to happen as the grammar accepts any tokens , but if it should
     *                              happen (ANTLR error?) this method cannot deal with the problem
     *                              and does not catch the exception.
     */
    public static String decodeHtmlEntities(final String html, final boolean recursive)
            throws RecognitionException, TokenStreamException, IOException {

        String result = html;
        boolean again = false;
        do {

            StringBuffer resultBuffer = new StringBuffer();
            HtmlEntityLexer lexer = new HtmlEntityLexer(new StringReader(result));
            HtmlEntityDecoder decoder = new HtmlEntityDecoder(lexer);
            Token token = decoder.decodeNext();
            while (token.getType() != Token.EOF_TYPE) {
                resultBuffer.append(token.getText());
                token = decoder.decodeNext();
            }
            result = resultBuffer.toString();
            again = decoder.isPotentialRemainingEntity();

        } while (again && recursive);
        return result;
    }

    /**
     * Main hook used for short test.
     * <p>
     *
     * @param args ignored.
     * @throws RecognitionException        if sth. in the parser goes wrong.
     * @throws TokenStreamException        if sth. in the lexer goes wrong.
     * @throws IOException                 if sth. in io goes wrong.
     * @throws UnknownOptionException      if arguments are wrong.
     * @throws IllegalOptionValueException if arguments are wronger.
     */
    public static void main(final String[] args)
            throws RecognitionException, TokenStreamException, IOException, IllegalOptionValueException, UnknownOptionException {

        try {
            CmdLineParser cmdLineParser = new CmdLineParser();
            Option charsetOption = cmdLineParser.addStringOption('c', "charset");
            cmdLineParser.parse(args);
            String encoding = (String) cmdLineParser.getOptionValue(charsetOption);
            String[] remainingArgs = cmdLineParser.getRemainingArgs();
            if (remainingArgs.length != 2) {
                printUsage("Input and output file are not specified correctly. ");
            }
            File inputFile = new File(remainingArgs[0]);
            if (!inputFile.exists()) {
                printUsage("Input file " + remainingArgs[0] + " does not exist. ");
            }
            File outputFile = new File(remainingArgs[1]);
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }
            String input = new String(FileUtil.readRAM(inputFile), encoding);
            String result = DecodeUtil.decodeHtmlEntities(input, true);

            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(outputFile), encoding);
            out.write(result);
            out.flush();
            out.close();
        } catch (Exception ex) {
            printUsage(ex.getMessage());
        }

    }

    /**
     * Creates an error message by throwing an exception.<p>
     *
     * @param errmsg the cause for the termination.
     * @throws IllegalArgumentException always to terminate.
     */
    private static void printUsage(final String errmsg) throws IllegalArgumentException {

        StringBuffer msg = new StringBuffer("java -jar htmlentitydecoder.jar <options> infile outfile\n");
        msg.append("  options: \n");
        msg.append("    -c [--charset] : The charset to use for reading / writing.\n");
        msg.append(errmsg);
        throw new IllegalArgumentException(msg.toString());
    }
}
