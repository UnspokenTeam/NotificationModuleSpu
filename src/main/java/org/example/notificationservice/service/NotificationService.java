package org.example.notificationservice.service;


import lombok.RequiredArgsConstructor;
import org.example.notificationservice.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void update(){}
    public void get(){}
}
