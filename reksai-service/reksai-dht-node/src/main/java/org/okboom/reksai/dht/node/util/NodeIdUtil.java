package org.okboom.reksai.dht.node.util;

import cn.hutool.core.net.NetUtil;
import cn.hutool.core.util.NumberUtil;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.PureJavaCrc32C;
import org.okboom.reksai.dht.node.api.domain.Node;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;

/**
 * @link https://github.com/xwlcn/Dodder/blob/master/dodder-common/src/main/java/cc/dodder/common/util/NodeIdUtil.java
 * @author Mr.Xu
 */
@Slf4j
public class NodeIdUtil {

    private static Random random = new Random(System.currentTimeMillis());

    /** 自身id */
    public static byte [] SELF_NODE_ID = getSelfNodeId();

    /** Node数据传输大小 */
    private final static Integer NODE_INFO_LENGTH_ON_DHT = 26;

    /** Node信息中ID末值索引 */
    private final static Integer NODE_INFO_ID_LAST_INDEX = 19;

    /** Node信息中IP值索引 */
    private final static Integer NODE_INFO_IP_START_INDEX = 20;

    /** Node信息中IP末值索引 */
    private final static Integer NODE_INFO_IP_LAST_INDEX = 23;

    /** Node信息中PORT值索引 */
    private final static Integer NODE_INFO_PORT_START_INDEX = 24;

    /** Node信息中PORT末值索引 */
    private final static Integer NODE_INFO_PORT_LAST_INDEX = 25;

    private static MessageDigest messageDigest;

    static {
        try {
            messageDigest = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
           log.error("{}", e.getMessage());
        }
    }

    public static String getRandomString(int size) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int randomNum = random.nextInt(256);
            sb.append(Character.toChars(randomNum));
        }

        return sb.toString();
    }

    /**
     * 节点ID算法
     * https://libtorrent.org/dht_sec.html
     * @return
     */
    public static byte [] getSelfNodeId() {
        log.info("ip:{}", NetUtil.getLocalhostStr());
        long ip = NetUtil.ipv4ToLong(NetUtil.getLocalhostStr());
        return getNodeIdByIp(ip);
    }

    public static byte [] getSelfNodeId(String ip) {
        long i = NetUtil.ipv4ToLong(ip);
        return getNodeIdByIp(i);
    }

    /**
     * 获取邻近的nodeId
     * @param nid
     * @return
     */
    public static byte[] getNeighbor(byte[] nid) {
        byte[] bytes = new byte[20];
        System.arraycopy(nid, 0, bytes, 0, 18);
        System.arraycopy(SELF_NODE_ID, 18, bytes, 18, 2);
        return bytes;
    }

    private static byte[] getNodeIdByIp(long ip) {
        int rand = new Random().nextInt(256);
        int r = rand & 0x7;

        PureJavaCrc32C crc32C = new PureJavaCrc32C();
        crc32C.update(NumberUtil.toBytes((int)(ip & 0x030f3fff) | (r << 29)), 0, 4);
        long crc = crc32C.getValue();

        byte[] node_id = new byte[20];
        node_id[0] = (byte)((crc >> 24) & 0xff);
        node_id[1] = (byte)((crc >> 16) & 0xff);
        node_id[2] = (byte)(((crc >> 8) & 0xf8) | (rand & 0x7));
        for (int i = 3; i < 19; ++i) {
            node_id[i] = (byte) random.nextInt(256);
        }
        node_id[19] = (byte)rand;

        return node_id;
    }

    /**
     * 生成随机id
     *
     * @return byte[] node id
     */
    public static byte[] generateRandomNodeId() {
        byte[] bytes = new byte[20];
        for (int i = 0; i < bytes.length; i++)
        {
            bytes[i] = (byte)random.nextInt(256);
        }
        messageDigest.update(bytes);
        return messageDigest.digest();
    }


    /**
     * 解析node
     * @param nodes
     * @return
     */
    public static List<Node> decodeNodes(byte [] nodes) {
        List<Node> result = Lists.newArrayList();

        for (int i = 0; i < nodes.length; i += NODE_INFO_LENGTH_ON_DHT) {
            try {
                byte[] currentNodeId = new byte[20];
                System.arraycopy(nodes, i, currentNodeId, 0, NODE_INFO_IP_START_INDEX);

                byte[] currentNodeIp = getByteArray(nodes, i + NODE_INFO_IP_START_INDEX, i + NODE_INFO_IP_LAST_INDEX);
                byte[] currentNodePort = getByteArray(nodes, i + NODE_INFO_PORT_START_INDEX, i + NODE_INFO_PORT_LAST_INDEX);

                int port = getPort(currentNodePort);
                String ip = InetAddress.getByAddress(currentNodeIp).getHostAddress();
                InetSocketAddress address = new InetSocketAddress(ip, port);
                Node node = Node.builder().nid(currentNodeId).address(address).build();

                result.add(node);
            } catch (Exception  e) {
                log.error("decodeNodes error: {}", e.getMessage());
            }
        }

        return result;
    }

    public static byte[] getByteArray(byte[] bytes, int start, int end) {
        byte[] newByteArray = new byte[end - start + 1];

        for(int i = start; i <= end; i ++) {
            newByteArray[i-start] = bytes[i];
        }

        return newByteArray;
    }

    public static int getPort(byte[] bytes) {
        return ((bytes[0] << 8) & 0x0000ff00) | (bytes[1] & 0x000000ff);
    }


}
