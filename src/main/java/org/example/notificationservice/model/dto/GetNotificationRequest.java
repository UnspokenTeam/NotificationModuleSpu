package org.example.notificationservice.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetNotificationRequest {
    private String start;
    private String end;
    private List<Integer> ids;

    @JsonProperty("task_ids")
    private List<Integer> taskIds;
}
