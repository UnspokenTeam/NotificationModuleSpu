package org.example.notificationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateNotificationRequest {
    private List<Integer> ids;

    @JsonProperty("is_read")
    private boolean read;
}