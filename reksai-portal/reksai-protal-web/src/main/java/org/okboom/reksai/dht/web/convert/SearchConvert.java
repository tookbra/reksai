package org.okboom.reksai.dht.web.convert;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.okboom.reksai.dht.search.dto.TorrentSearchPageDTO;
import org.okboom.reksai.dht.web.params.SearchParam;

/**
 * @author tookbra
 */
@Mapper
public interface SearchConvert {

    SearchConvert INSTANCE = Mappers.getMapper(SearchConvert.class);

    /**
     * convert SearchParam to TorrentSearchPageDTO
     * @param searchParam
     * @return
     */
    TorrentSearchPageDTO convert(SearchParam searchParam);
}
