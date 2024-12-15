package org.example.notificationservice.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    //fixme: Доработать типы по результату обсуждения
    @KafkaListener(topics = "notification", groupId = "notification-service-group")
    public void processNotifications(ConsumerRecord<String, Object> record) {

    }
}
