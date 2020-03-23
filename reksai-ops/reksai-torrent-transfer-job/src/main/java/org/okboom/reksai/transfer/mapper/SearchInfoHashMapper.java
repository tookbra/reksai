package org.okboom.reksai.transfer.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.okboom.reksai.transfer.domain.SearchInfoHash;

import java.util.List;

/**
 * @author tookbra
 */
public interface SearchInfoHashMapper extends BaseMapper<SearchInfoHash> {

    /**
     * 分页查询
     * @param page
     * @return
     */
    List<SearchInfoHash> pageInfoHashes(IPage page);
}
