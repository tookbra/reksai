package org.okboom.reksai.dht.node;

import org.junit.Test;
import org.okboom.reksai.dht.node.util.NodeIdUtil;
import org.okboom.reksai.dht.node.util.bencode.BencodingUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author tookbra
 */
public class DhtQueriesTest {

    /**
     * {"t":"aa", "y":"q", "q":"ping", "a":{"id":"abcdefghij0123456789"}}
     */
    @Test
    public void testPing() {
        Map map = new HashMap<String, Object>(10);
        map.put("id", NodeIdUtil.getNeighbor("abcdefghij0123456789".getBytes()));
        encode("aa".getBytes(), "r", map);
    }

    private void encode(byte[] t, String y, Map<String, Object> arg) {
        byte[] buffer = BencodingUtils.encode(new HashMap<Object, Object>(10) {{
            put("t", t);
            put("y", y);
            if (!arg.containsKey("id")) {
//                arg.put("id", DHTServer.SELF_NODE_ID);
            }

            if (y.equals("q")) {
                put("q", t);
                put("a", arg);
            } else {
                put("r", arg);
            }
        }});
        System.out.println(buffer);
        System.out.println(new String(buffer));
    }
}
