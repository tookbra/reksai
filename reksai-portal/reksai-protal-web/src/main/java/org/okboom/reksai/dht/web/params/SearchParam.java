package org.okboom.reksai.dht.web.params;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.okboom.reksai.data.support.Query;

import javax.validation.constraints.NotEmpty;

/**
 * @author tookbra
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SearchParam extends Query {

    private String infoHash;
    /**
     * 文件名
     */
    @NotEmpty(message = "请输入你要搜索的关键词")
    private String fileName;
    /**
     * 文件类型
     */
    private String fileType;
}
