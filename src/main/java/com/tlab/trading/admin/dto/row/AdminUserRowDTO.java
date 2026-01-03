package com.tlab.trading.admin.dto.row;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AdminUserRowDTO {
  private int userId;
  private String name;
  private String affiliation;
  private LocalDateTime updatedAt;

  private String roleName;
  private String authProviderName;

  private int pendingCnt;
  private int balance;
}
