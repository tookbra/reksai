package org.okboom.reksai.job.properties;

import lombok.Data;

/**
 * xxl-job 调度中心配置
 * @author tookbra
 */
@Data
public class XxlAdminProperties {

    /**
     * 调用中心地址
     */
    private String addresses = "http://127.0.0.1:8080/xxl-job-admin";
}
