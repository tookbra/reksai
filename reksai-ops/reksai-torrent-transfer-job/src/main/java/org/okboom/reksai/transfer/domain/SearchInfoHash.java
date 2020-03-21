package org.okboom.reksai.transfer.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tookbra
 */
@Data
@ToString
@TableName("search_hash")
public class SearchInfoHash implements Serializable {

    private String infoHash;

    private String category;

    private String extension;

    private long length;

    private String name;

    private Date createTime;

}
