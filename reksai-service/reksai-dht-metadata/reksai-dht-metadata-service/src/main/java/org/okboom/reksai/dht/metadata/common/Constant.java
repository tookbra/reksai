package org.okboom.reksai.dht.metadata.common;

/**
 * @author tookbra
 */
public class Constant {

    /**
     * bt协议名称
     */
    public static final String BT_PROTOCOL_NAME = "BitTorrent protocol";

    /**
     * ut_metadata
     */
    public static final String UT_METADATA = "ut_metadata";

    /**
     * metadata_size
     */
    public static final String METADATA_SIZE = "metadata_size";

    public static final byte[] BT_RESERVED = new byte[] { (byte) (0x00 & 0xff),
            (byte) (0x00 & 0xff), (byte) (0x00 & 0xff), (byte) (0x00 & 0xff),
            (byte) (0x00 & 0xff), (byte) (0x10 & 0xff), (byte) (0x00 & 0xff),
            (byte) (0x01 & 0xff), };

    /**
     * BitTorrent协议版本
     */
    public static final byte PSTR_LEN = 19;

    /**
     * 扩展消息标志
     */
    public static final byte BT_MSG_ID = 20 & 0xff;

    public static final int EXT_HANDSHAKE_ID = 0;

    public static final byte[] EXT_HANDSHAKE_DATA = "d1:md11:ut_metadatai1eee".getBytes();

    /**
     * 最大 1M
     */
    public static final int MAX_METADATA_SIZE = 1024 * 1024 * 50;


}
