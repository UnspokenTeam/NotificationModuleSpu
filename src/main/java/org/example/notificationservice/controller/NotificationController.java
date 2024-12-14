package org.example.notificationservice.controller;

import org.example.notificationservice.model.dto.GetNotificationRequest;
import org.example.notificationservice.model.dto.GetNotificationResponse;
import org.example.notificationservice.model.dto.UpdateNotificationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/notifications")
public class NotificationController {

    @PostMapping("/get")
    public ResponseEntity<GetNotificationResponse> getNotifications(@RequestBody GetNotificationRequest request) {
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update")
    public ResponseEntity<Void> updateNotifications(@RequestBody UpdateNotificationRequest request) {
        return ResponseEntity.ok().build();
    }
}
