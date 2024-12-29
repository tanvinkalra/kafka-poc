package io.kafkapoc;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "philosophers",
            groupId = "plato"
    )
    void listener(String data) {
        System.out.println("Message received: " + data + " \uD83D\uDE03");
    }
}
