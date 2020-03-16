package org.okboom.reksai.tool;

import info.monitorenter.cpdetector.io.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 * @author tookbra
 */
public class StringUtil {

    public static CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance();

    static {
        detector.add(new ParsingDetector(false));
        detector.add(JChardetFacade.getInstance());
        detector.add(ASCIIDetector.getInstance());
        detector.add(UnicodeDetector.getInstance());
    }
    /**
     * 获取 byte[] 编码类型
     *
     * @param bytes bytes数组
     * @return      编码类型
     */
    public static String getEncoding(byte[] bytes) {
        String defaultEncoding = "UTF-8";
        try(ByteArrayInputStream in = new ByteArrayInputStream(bytes)) {
            java.nio.charset.Charset charset = detector.detectCodepage(in, bytes.length);
            defaultEncoding = charset.name();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return defaultEncoding;
    }

    public static String formatSize(double size) {

        int rank = 0;
        String rankchar = "Bytes";

        while (size > 1024) {
            size = size / 1024;
            rank++;
        }
        switch (rank) {
            case 1:
                rankchar = "KB";
                break;
            case 2:
                rankchar = "MB";
                break;
            case 3:
                rankchar = "GB";
                break;
            default:
                rankchar = "B";
        }
        return new DecimalFormat("0.##").format(size) + " " + rankchar;
    }
}
