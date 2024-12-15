package org.example.notificationservice.repository;

import org.example.notificationservice.model.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Long, Notification> {
}
