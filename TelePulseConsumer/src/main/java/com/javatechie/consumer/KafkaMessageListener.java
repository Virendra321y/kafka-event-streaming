package com.javatechie.consumer;

import com.javatechie.dto.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    
    /**
     * The `groupId` identifies the consumer group for Kafka.
     * Consumers with the same `groupId` share the load of reading data from topic partitions.
     * If only one consumer is in the group (like here), it will receive all messages from all partitions.
     * To distribute the load, use multiple consumers in the same group, ideally matching the number of topic partitions.
     */
    @KafkaListener(topics = "javatechie-demo",groupId = "jt-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }
    
    
      /*
       * we can create multiple consumer like consumer 2, 3, 4 ... like this but it is not good prectice to create multiple deffrent
       * consumer it is deffrent method we dont like to write deffrent, ... better we can write a method which can create a consumerId
       * and mannage all 
       */
//    @KafkaListener(topics = "javatechie-demo1",groupId = "jt-group-new")
//    public void consume2(String message) {
//        log.info("consumer2 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "javatechie-demo1",groupId = "jt-group-new")
//    public void consume3(String message) {
//        log.info("consumer3 consume the message {} ", message);
//    }
//
//    @KafkaListener(topics = "javatechie-demo1",groupId = "jt-group-new")
//    public void consume4(String message) {
//        log.info("consumer4 consume the message {} ", message);
//    }
}
