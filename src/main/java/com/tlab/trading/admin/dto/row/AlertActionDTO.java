package com.tlab.trading.admin.dto.row;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AlertActionDTO {
    private int alertActionId;
    private int alertId;
    private int adminUserId;
    private String actionCode;
    private String comment;
    private LocalDateTime createdAt;
}