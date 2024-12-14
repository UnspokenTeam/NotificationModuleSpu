package org.example.notificationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetNotificationResponse {
    private Integer id;
    private String text;
    @JsonProperty("task_id")
    private Integer taskId;
    @JsonProperty("task_name")
    private String taskName;
}
