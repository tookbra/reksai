package org.okboom.reksai.dht.metadata.util;

import cn.hutool.core.util.HexUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSONUtil;
import org.okboom.reksai.dht.metadata.domain.Node;
import org.okboom.reksai.dht.metadata.domain.Torrent;
import org.okboom.reksai.tool.StringUtil;

import java.math.BigInteger;
import java.util.*;

/**
 * @author tookbra
 */
public final class TorrentUtil {

    public static final String INFO = "info";

    public static final String NAME = "name";

    public static final String ENCODING = "encoding";

    public static final String CREATION_DATE = "creation date";

    public static final String NAME_UTF8 = "name.utf-8";

    public static final String FILES = "files";

    /**
     * 解析 Torrent 文件信息，封装成对象
     *
     * 多文件Torrent的结构的树形图为：
     *
     * Multi-file Torrent
     * ├─announce
     * ├─announce-list
     * ├─comment
     * ├─comment.utf-8
     * ├─creation date
     * ├─encoding
     * ├─info
     * │ ├─files
     * │ │ ├─length
     * │ │ ├─path
     * │ │ └─path.utf-8
     * │ ├─name
     * │ ├─name.utf-8
     * │ ├─piece length
     * │ ├─pieces
     * │ ├─publisher
     * │ ├─publisher-url
     * │ ├─publisher-url.utf-8
     * │ └─publisher.utf-8
     * └─nodes
     *
     * 单文件Torrent的结构的树形图为：
     *
     * Single-File Torrent
     * ├─announce
     * ├─announce-list
     * ├─comment
     * ├─comment.utf-8
     * ├─creation date
     * ├─encoding
     * ├─info
     * │ ├─length
     * │ ├─name
     * │ ├─name.utf-8
     * │ ├─piece length
     * │ ├─pieces
     * │ ├─publisher
     * │ ├─publisher-url
     * │ ├─publisher-url.utf-8
     * │ └─publisher.utf-8
     * └─nodes
     *
     * @param infoHash
     * @param map
     * @return java.util.Optional<cc.dodder.common.entity.Torrent>
     */
    public static final Torrent parseTorrent(byte[] infoHash, Map map) {
        String encoding = null;
        Map<String, Object> info;
        if (map.containsKey(INFO)) {
            info = (Map<String, Object>) map.get(INFO);
        } else {
            info = map;
        }

        if (!info.containsKey(NAME)) {
            return null;
        }
        if (map.containsKey(ENCODING)) {
            encoding = (String) map.get(ENCODING);
        }

        Torrent torrent = new Torrent();

        if (map.containsKey(CREATION_DATE)) {
            torrent.setCreateDate(((BigInteger) map.get(CREATION_DATE)).longValue());
        } else {
            torrent.setCreateDate(System.currentTimeMillis());
        }

        byte[] temp;
        if (info.containsKey(NAME_UTF8)) {
            temp = (byte[]) info.get(NAME_UTF8);
            encoding = "UTF-8";
        }
        else {
            temp = (byte[]) info.get(NAME);
            if (encoding == null) {
                encoding = StringUtil.getEncoding(temp);
            }
        }

        torrent.setFileName(StrUtil.str(temp, encoding));

        // 多文件
        if (info.containsKey(FILES)) {
            parseMultiFile(torrent, info);
        } else {
            torrent.setFileSize(((BigInteger) info.get("length")).longValue());

            String type = ExtensionUtil.getExtensionType(torrent.getFileName());
            if (type != null) {
                torrent.setFileType(type);
            }
        }
        torrent.setInfoHash(HexUtil.encodeHexStr(infoHash));
        return torrent;
    }

    /**
     * 解析多文件
     * @param torrent
     */
    private static void parseMultiFile(Torrent torrent, Map<String, Object> info) {
        Set<String> types = new HashSet<>();

        List<Map<String, Object>> list = (List<Map<String, Object>>) info.get("files");

        long total = 0;
        int i = 0;
        List<Node> nodes = new ArrayList<>();
        int cur = 1, parent = 0;
        for (Map<String, Object> f : list) {
            long length = ((BigInteger) f.get("length")).longValue();
            total += length;

            // null 表示为文件夹
            Long fileSize = null;
            boolean uft8 = f.containsKey("path.utf-8");
            List<byte[]> aList = f.containsKey("path.utf-8") ? (List<byte[]>) f.get("path.utf-8") : (List<byte[]>) f.get("path");
            int j = 0;
            for (byte[] bytes : aList) {
                String sname = StrUtil.str(bytes, uft8 ? "UTF-8" : StringUtil.getEncoding(bytes));
                if (sname.contains("_____padding_file_")) {
                    continue;
                }
                if (j == aList.size() - 1) {
                    fileSize = length;
                    String type = ExtensionUtil.getExtensionType(sname);
                    if (type != null) {
                        types.add(type);
                    }
                }
                Node node = new Node(cur, j == 0 ? 0 : parent, sname, fileSize, i);
                if (!nodes.contains(node)) {
                    nodes.add(node);
                    parent = cur;
                } else {
                    parent = nodes.get(nodes.indexOf(node)).getNid();
                }
                cur++;
                j++;
            }
            i++;
        }
        Node node = TreeUtil.createTree(nodes);
        torrent.setFileSize(total);
        torrent.setFiles(JSONUtil.toJsonStr(node));
        if (types.size() <= 0) {
            types.add("其他");
        }
        String sType = String.join(",", types);
        if (sType != null && !"".equals(sType)) {
            torrent.setFileType(sType);
        }
    }
}
