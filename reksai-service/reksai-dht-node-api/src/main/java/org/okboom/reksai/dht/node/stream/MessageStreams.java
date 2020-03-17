package org.okboom.reksai.dht.node.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * 种子信息 stream
 * @author tookbra
 */
public interface MessageStreams {

    String INPUT = "download-metadata-in";
    String OUTPUT = "download-metadata-out";

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
