package org.example.notificationservice.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


//fixme: Доработать по результатам обсуждения модели базы данных
@Entity
public class Notification {
    @Id
    private Long id;
    private String text;
    private Integer taskId;
    private String taskName;
}
