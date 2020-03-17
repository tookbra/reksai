/*
 * FileUtil.java, helpers for disk I/O.
 * Copyright (C) 2001 Achim Westermann, created on 13.10.2001
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
 * ***** END LICENSE BLOCK ***** *
 *
 * If you modify or optimize the code in a useful way please let me know.
 * Achim.Westermann@gmx.de
 */

package info.monitorenter.cpdetector.util;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Achim Westermann
 * @version 1.1
 */
public class FileUtil
        extends Object {

    /**
     * Defcon.
     * <p>
     */
    public FileUtil() {

        // nop
    }

    /**
     * Be careful with big files: In order to avoid having to write a tmpfile
     * (cannot read and directly write to the same file) a StringBuffer is used
     * for manipulation. Big files will cost all RAM and terminate VM hard.
     */
    public static void removeDuplicateLineBreaks(final File f) {

        String sep = StringUtil.getNewLine();
        if (!f.exists()) {
            System.err.println("FileUtil.removeDuplicateLineBreak(File f): " + f.getAbsolutePath()
                    + " does not exist!");
            return;
        }
        if (f.isDirectory()) {
            System.err.println("FileUtil.removeDuplicateLineBreak(File f): " + f.getAbsolutePath()
                    + " is a directory!");
            return;
        }
        // real file
        try {
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(f), 1024);
            StringBuffer result = new StringBuffer();
            int tmpread;
            while ((tmpread = in.read()) != -1) {
                result.append((char) tmpread);
            }
            String tmpstring;
            StringTokenizer toke = new StringTokenizer(result.toString(), sep, true);
            result = new StringBuffer();
            int breaks = 0;
            while (toke.hasMoreTokens()) {
                tmpstring = toke.nextToken().trim();
                if (tmpstring.equals("") && breaks > 0) {
                    breaks++;
                    // if(breaks<=2)result.append(sep);
                    continue;
                }
                if (tmpstring.equals("")) {
                    tmpstring = sep;
                    breaks++;
                } else {
                    breaks = 0;
                }
                result.append(tmpstring);
            }
            // delete original file and write it new from tmpfile.
            f.delete();
            f.createNewFile();
            FileWriter out = new FileWriter(f);
            out.write(result.toString());
            out.flush();
        } catch (FileNotFoundException e) {
            // does never happen.
        } catch (IOException g) {
            g.printStackTrace(System.err);
        }
    }

    /**
     * Finds a filename based on the given name. If a file with the given name
     * does not exist, <tt>name</tt> will be returned.
     * <p>
     * Else:
     *
     * <pre>
     *  &quot;myFile.out&quot;     --&gt; &quot;myFile_0.out&quot;
     *  &quot;myFile_0.out&quot;   --&gt; &quot;myFile_1.out&quot;
     *  &quot;myFile_1.out&quot;   --&gt; &quot;myFile_2.out&quot;
     *  ....
     * </pre>
     *
     * <p>
     * <p>
     * The potential extension is preserved, but a number is appended to the
     * prefix name.
     * <p>
     *
     * @param name A desired file name.
     * @return A String that sticks to the naming convention of the given String
     * but is unique in the directory scope of argument <tt>name</tt>.
     */
    public static String getDefaultFileName(final String name) {

        File f = new File(name);
        if (!f.exists()) {
            return f.getAbsolutePath();
        }
        Map.Entry cut = cutExtension(name);
        String prefix = (String) cut.getKey();
        String suffix = (String) cut.getValue();
        int num = 0;
        while (f.exists()) {
            f = new File(prefix + '_' + num + '.' + suffix);
            num++;
        }
        return f.getAbsolutePath();
    }

    /**
     * Cuts a String into the part before the last dot and after the last dot. If
     * only one dot is contained on the first position, it will completely be used
     * as prefix part.
     * <p>
     *
     * <pre>
     * Map.Entry entry = FileUtil.getPotentialExtension(&quot;A.Very.Strange.Name.txt&quot;);
     * String prefix = (String)entry.getKey(); // prefix is &quot;A.Very.Strange.Name&quot;.
     * String suffix = (String)entry.getValue(); // suffix is &quot;txt&quot;;
     *
     * entry = FileUtil.getPotentialExtension(&quot;.profile&quot;);
     * String prefix = (String)entry.getKey(); // prefix is &quot;.profile&quot;.
     * String suffix = (String)entry.getValue(); // suffix is &quot;&quot;;
     *
     * entry = FileUtil.getPotentialExtension(&quot;bash&quot;);
     * String prefix = (String)entry.getKey(); // prefix is &quot;bash&quot;.
     * String suffix = (String)entry.getValue(); // suffix is &quot;&quot;;
     *
     * </pre>
     *
     * <p>
     *
     * @param filename A String that is interpreted to be a file name: The last dot ('.')
     *                 is interpreted to be the extension delimiter.
     * @return A <tt> java.util.Map.Entry</tt> instance containing a String for
     * the filename at the key side and a String for the extension at the
     * value side.
     */
    public static Map.Entry cutExtension(final String filename) {

        String prefix;
        String suffix = null;
        StringTokenizer tokenizer = new StringTokenizer(filename, ".");
        int tokenCount = tokenizer.countTokens();
        if (tokenCount > 1) {
            StringBuffer prefCollect = new StringBuffer();
            while (tokenCount > 1) {
                tokenCount--;
                prefCollect.append(tokenizer.nextToken());
                if (tokenCount > 1) {
                    prefCollect.append(".");
                }
            }
            prefix = prefCollect.toString();
            suffix = tokenizer.nextToken();
        } else {
            prefix = filename;
            suffix = "";
        }
        return new Entry(prefix, suffix);
    }

    /**
     * Cuts the path information of the String that is interpreted as a filename
     * into the directory part and the file part. The current operating system's
     * path separator is used to cut all path information from the String.
     * <p>
     *
     * <pre>
     *
     *  &quot;c:/work/programming/anyfile.jar   --&gt; Map.Entry(&quot;c:/work/programming/&quot;,&quot;anyfile.jar&quot;);
     *  &quot;anyfile.jar&quot;                 --&gt; Map.Entry(new File(&quot;.&quot;).getAbsolutePath(),&quot;anyfile.jar&quot;);
     *  &quot;c:/directory1/directory2/&quot;   --&gt; Map.Entry(&quot;c:/directory1/directory2/&quot;,&quot;&quot;);
     *  &quot;c:/directory1/directory2&quot;    --&gt; Map.Entry(&quot;c:/directory1/directory2/&quot;,&quot;&quot;); // directory2 is a dir!
     *  &quot;c:/directory1/file2&quot;         --&gt; Map.Entry(&quot;c:/directory1/&quot;,&quot;file2&quot;);       // file2 is a file!
     *  &quot;c:/&quot;                         --&gt; Map.Entry(&quot;c:/&quot;,&quot;&quot;);
     *
     * </pre>
     * <p>
     * Assuming, that '/' is the current file separator character.
     * <p>
     * <b>If your string is retrieved from an <tt>URL</tt> instance, use
     * <tt>cutDirectoryInformation(URL path)</tt> instead, because URL's do not
     * depend on the operating systems file separator! </b>
     * <p>
     *
     * @param path the absolute file path you want the mere file name of.
     * @return the <code>{@link Map.Entry}</code> consisting of path information
     * and file name.
     */
    public static Map.Entry cutDirectoryInformation(final String path) {

        StringBuffer dir = new StringBuffer();
        String file = "";
        String fileseparator = System.getProperty("file.separator");
        StringTokenizer tokenizer = new StringTokenizer(path, fileseparator);
        int size = tokenizer.countTokens();
        switch (size) {
            case 0:
                dir.append(new File(".").getAbsolutePath());
                break;

            case 1:
                File test = new File(tokenizer.nextToken());
                if (new File(path).isDirectory()) {
                    dir.append(test.getAbsolutePath());
                } else {
                    dir.append(new File(".").getAbsolutePath());
                    file = path;
                }
                break;

            default:
                String token;
                while (tokenizer.hasMoreElements()) {
                    // reuse String filesparator: bad style...
                    token = tokenizer.nextToken();
                    if (tokenizer.hasMoreTokens()) {
                        dir.append(token);
                        dir.append(fileseparator);
                    } else {
                        if (new File(path).isFile()) {
                            file = token;
                        } else {
                            dir.append(token);
                        }
                    }
                }
        }

        return new Entry(dir.toString(), file);
    }

    /**
     * Cuts all path information of the String representation of the given URL.
     * <p>
     *
     * <pre>
     *
     *  &quot;file//c:/work/programming/anyfile.jar --&gt; &quot;anyfile.jar&quot;
     *  &quot;http://jamwg.de&quot;                 --&gt; &quot;&quot; // No file part.
     *  &quot;ftp://files.com/directory2/           --&gt; &quot;&quot; // File part of URL denotes a directory.
     *
     * </pre>
     * <p>
     * Assuming, that '/' is the current file separator character.
     * <p>
     *
     * @param path the absolute file path you want the mere file name of.
     * @return the <code>{@link Map.Entry}</code> consisting of path information
     * and file name.
     */
    public static Map.Entry cutDirectoryInformation(final java.net.URL path) {

        Map.Entry ret = null;
        String pre;
        String suf;
        String parse;
        StringBuffer tmp = new StringBuffer();
        parse = path.toExternalForm();
        if (parse.endsWith("/")) {
            pre = parse;
            suf = "";
        } else {
            StringTokenizer tokenizer = new StringTokenizer(path.getFile(), "/");
            tmp.append(path.getProtocol());
            tmp.append(":");
            tmp.append(path.getHost());
            pre = "";
            while (tokenizer.hasMoreElements()) {
                tmp.append(pre);
                pre = tokenizer.nextToken();
                tmp.append("/");
            }
            suf = pre;
            pre = tmp.toString();
        }
        ret = new Entry(pre, suf);
        return ret;
    }

    /**
     * Reads the content of the given File into an array.
     * <p>
     * This method currently does not check for maximum length and might cause a
     * java.lang.OutOfMemoryError. It is only intended for
     * performance-measurements of data-based algorithms that want to exclude
     * I/O-usage.
     * <p>
     * <p>
     * Warning: This method will fail for big files to to memory problems or an
     * carry overflow when downcasting long of <code>file.length()</code> to
     * <code>int</code>.
     * <p>
     *
     * @throws IOException
     */
    public static byte[] readRAM(final File f) throws IOException {

        return readRAM(new FileInputStream(f), (int) f.length());
    }

    /**
     * Reads <code>length</code> of bytes of content of the given
     * <code>InputStream</code> into an array.
     * <p>
     * This method currently does not check for maximum length and might cause a
     * java.lang.OutOfMemoryError. It is only intended for
     * performance-measurements of data-based algorithms that want to exclude
     * I/O-usage.
     * <p>
     *
     * @param in     the input stream to read.
     * @param length the amount of bytes to read from the input stream.
     * @throws IOException if sth goes wrong.
     */
    public static byte[] readRAM(final InputStream in, final int length) throws IOException {

        byte[] ret = new byte[length];
        try {
            int offset = 0;
            int read = 0;
            do {
                read = in.read(ret, offset, length - read);
                if (read > 0) {
                    offset += read;
                }
            } while (read != -1 && offset != length);
            return ret;
        } finally {
            in.close();
        }
    }

    /**
     * Reads all bytes of content of the given <code>InputStream</code> into an
     * array.
     * <p>
     * This method currently does not check for maximum length and might cause a
     * java.lang.OutOfMemoryError. It is only intended for
     * performance-measurements of data-based algorithms that want to exclude
     * I/O-usage.
     * <p>
     * If you know the amount of bytes in the given
     * <code>{@link InputStream}</code> prefer invoking
     * <code>{@link #readRAM(InputStream, int)}</code> as it performs much
     * better. This implementation first as to use a buffer that grows dynamically
     * and then allocate an array and copy all content as the length is unknown.
     * <p>
     *
     * @param in the input stream to read.
     * @throws IOException if sth goes wrong.
     * @see #readRAM(InputStream, int)
     */
    public static byte[] readRAM(final InputStream in) throws IOException {

        byte[] buffer = new byte[1024];
        // choose a higher start value to avoid many System.arrayCopy,
        // implementation will grow by factor 2.
        ByteArrayOutputStream collect = new ByteArrayOutputStream(512);
        try {
            int read = 0;
            do {
                read = in.read(buffer);
                if (read > 0) {
                    collect.write(buffer, 0, read);
                }
            } while (read != -1);
            return collect.toByteArray();
        } finally {
            in.close();
        }
    }

    /**
     * Invokes {@link #readRAM(File)}, but decorates the result with a
     * {@link ByteArrayInputStream}.
     * <p>
     * This means: The complete content of the given File has been loaded before
     * using the returned InputStream. There are no IO-delays afterwards but
     * OutOfMemoryErrors may occur.
     * <p>
     *
     * @param f the file to cache.
     * @return an input stream backed by the file read into memory.
     */
    public static InputStream readCache(final File f) throws IOException {

        return new ByteArrayInputStream(readRAM(f));
    }

    /**
     * Tests wether the given file only contains ASCII characters if interpreted
     * by reading bytes (16 bit).
     * <p>
     * This does not mean that the file is really an ASCII text file. It just
     * might be viewed with an editor showing only valid ASCII characters.
     * <p>
     *
     * @param f the file to test.
     * @return true if all bytes in the file are in the ASCII range.
     * @throws IOException on a bad day.
     */
    public static boolean isAllASCII(final File f) throws IOException {

        return isAllASCII(new FileInputStream(f));
    }

    /**
     * Tests wether the given input stream only contains ASCII characters if
     * interpreted by reading bytes (16 bit).
     * <p>
     * This does not mean that the underlying content is really an ASCII text
     * file. It just might be viewed with an editor showing only valid ASCII
     * characters.
     * <p>
     *
     * @param in the stream to test.
     * @return true if all bytes in the given input stream are in the ASCII range.
     * @throws IOException on a bad day.
     */
    public static boolean isAllASCII(final InputStream in) throws IOException {

        boolean ret = true;
        int read = -1;
        do {
            read = in.read();
            if (read > 0x7F) {
                ret = false;
                break;
            }

        } while (read != -1);
        return ret;
    }

    /**
     * Tests, wether the content of the given file is identical at character
     * level, when it is opened with both different Charsets.
     * <p>
     * This is most often the case, if the given file only contains ASCII codes
     * but may also occur, when both codepages cover common ranges and the
     * document only contains values m_out of those ranges (like the EUC-CN
     * charset contains all mappings from BIG5).
     * <p>
     *
     * @param document the file to test.
     * @param a        the first character set to interpret the document in.
     * @param b        the 2nd character set to interpret the document in.
     * @throws IOException if sth. goes wrong.
     */
    public static boolean isEqual(final File document, final Charset a, final Charset b)
            throws IOException {

        boolean ret = true;
        InputStreamReader aReader = new InputStreamReader(new FileInputStream(document), a);
        InputStreamReader bReader = new InputStreamReader(new FileInputStream(document), b);
        int readA = -1;
        int readB = -1;
        do {
            readA = aReader.read();
            readB = bReader.read();
            if (readA != readB) {
                // also the case, if one is at the end earlier...
                ret = false;
                break;
            }
        } while (readA != -1 && readB != -1);
        return ret;
    }
}
