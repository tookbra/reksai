package org.okboom.reksai.dht.search.convert;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;
import org.okboom.reksai.dht.search.domain.Torrent;
import org.okboom.reksai.dht.search.domain.TorrentDocument;
import org.okboom.reksai.dht.search.dto.TorrentDTO;

import java.util.List;

/**
 * @author tookbra
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TorrentConvert {

    TorrentConvert INSTANCE = Mappers.getMapper(TorrentConvert.class);

    /**
     * convert Torrent to TorrentDTO
     * @param torrent
     * @return
     */
    TorrentDTO convert(Torrent torrent);

    /**
     * convert TorrentDocument to TorrentDTO
     * @param torrentDocument
     * @return
     */
    List<TorrentDTO> convertDocuments(List<TorrentDocument> torrentDocument);
}
