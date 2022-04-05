package dev.lucas;

import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
public class SqsConsumer {

    @SqsListener(value = "minha-primeira-queue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void consume(String message){

        System.out.println(message);

    }
}
