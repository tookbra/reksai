/*
 * EncodeUtil.java, utility class to encode unicode to various target formats.
 *
 * Copyright 2007 (C) Achim Westermann,
 * created on 30.05.2007 21:09:48.
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

package info.monitorenter.unicode.encoder;

import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStreamException;
import info.monitorenter.unicode.encoder.latex.LatexEncoder;
import info.monitorenter.unicode.encoder.latex.LatexEncoderLexer;

import java.io.StringReader;

/**
 * Utility class to encode unicode to various target formats.
 * <p>
 * <p>
 * Be careful with the methods that work on String data (vs. Streams): Large
 * documents will cause an <code>{@link OutOfMemoryError}</code>.
 * <p>
 *
 * @author <a href="mailto:Achim.Westermann@gmx.de">Achim Westermann</a>
 * @version $Revision: 1.5 $
 */
public final class EncodeUtil {

    /**
     * Utility class ctor.
     * <p>
     */
    private EncodeUtil() {

        // nop
    }

    /**
     * Encodes the given unicode input <code>String</code> to latex - compliant
     * input data.
     * <p>
     * <p>
     * This covers special characters as german "Umlauts", French accented
     * characters,... .
     * <p>
     *
     * @param unicode the unicode <code>String</code> to encode to latex format.
     * @return the latex - encoded version of the input <code>String</code>.
     * @throws TokenStreamException if something goes wrong while lexing for the next token.
     * @throws RecognitionException if something goes wrong while parsing the next token.
     */
    public static String encodeLatex(final String unicode) throws RecognitionException, TokenStreamException {

        StringBuffer result = new StringBuffer();

        LatexEncoderLexer lexer = new LatexEncoderLexer(new StringReader(unicode));
        LatexEncoder encoder = new LatexEncoder(lexer);
        Token token = encoder.encodeNext();
        while (token.getType() != Token.EOF_TYPE) {
            result.append(token.getText());
            token = encoder.encodeNext();
        }
        return result.toString();
    }

}
