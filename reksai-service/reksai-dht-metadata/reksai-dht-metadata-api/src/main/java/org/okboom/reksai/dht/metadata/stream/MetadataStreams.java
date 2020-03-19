package org.okboom.reksai.dht.metadata.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 种子信息 stream
 * @author tookbra
 */
public interface MetadataStreams {

    String INPUT = "store-metadata-in";
    String OUTPUT = "store-metadata-out";

    /**
     * input
     *
     * @return SubscribableChannel
     */
    @Input(INPUT)
    SubscribableChannel subscribableChannel();

    /**
     * output
     *
     * @return MessageChannel
     */
    @Output(OUTPUT)
    MessageChannel messageChannel();
}
