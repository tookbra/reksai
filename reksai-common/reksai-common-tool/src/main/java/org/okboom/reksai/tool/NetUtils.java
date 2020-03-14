package org.okboom.reksai.tool;

import cn.hutool.core.net.NetUtil;

/**
 * @author tookbra
 */
public class NetUtils extends NetUtil {

    /**
     * 获取端口，乳如果为-1则返回随机端口
     * @param port
     * @return
     */
    public static int getAvailablePort(int port) {
        if(port < 0) {
            return getUsableLocalPort();
        }
        return port;
    }
}
