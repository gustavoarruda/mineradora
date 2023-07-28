package org.br.mineradora.message;

import jakarta.enterprise.context.ApplicationScoped;
import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ApplicationScoped
public class KafkaEvents {

    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel( "quotation-channel" )
    Emitter<QuotationDTO> quotationDtoEmitter;

    public void sendNewKafkaEvent(QuotationDTO quotation) {
        LOG.info( "-- Sending quotation for kafka topic --" );
        quotationDtoEmitter.send(quotation).toCompletableFuture().join();
    }
}
