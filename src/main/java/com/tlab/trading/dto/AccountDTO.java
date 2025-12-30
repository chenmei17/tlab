package com.tlab.trading.dto;

import lombok.Data;

/* ----------------------------------
 * 유저별 보유 포인트 DTO 
---------------------------------- */
@Data
public class AccountDTO {
	// private Users users;
	private Long 	balance; 	// 포인트 잔고
	private String 	updated_at; // 수정일시
}
