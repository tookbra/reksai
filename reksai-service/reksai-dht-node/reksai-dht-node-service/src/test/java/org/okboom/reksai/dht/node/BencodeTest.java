package org.okboom.reksai.dht.node;

import org.junit.Assert;
import org.junit.Test;
import org.okboom.reksai.tool.bencode.BencodingUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tookbra
 */
public class BencodeTest {

    /**
     * 存放顺序不一致会导致解析出来的和原有的不一样
     */
    @Test
    public void testEncode() {
        //  {"t":"aa", "y":"q", "q":"ping", "a":{"id":"abcdefghij0123456789"}}
        byte[] encoded = BencodingUtils.encode(new HashMap<Object, Object>() {{
            put("t", "aa");
            put("a", new HashMap() {{
                put("id", "abcdefghij0123456789");
            }});
            put("q", "ping");
            put("y", "q");
        }});

        System.out.println(new String(encoded));
        Assert.assertEquals(new String(encoded), "d1:ad2:id20:abcdefghij0123456789e1:q4:ping1:t2:aa1:y1:qe");


    }

    @Test
    public void decode() {
        Map<String, ?> dict = BencodingUtils.decode("d1:ad2:id20:abcdefghij0123456789e1:q4:ping1:t2:aa1:y1:qe".getBytes());
        System.out.println(dict.get("y"));
    }
}
