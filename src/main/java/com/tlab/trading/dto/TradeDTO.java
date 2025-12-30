package com.tlab.trading.dto;

import lombok.Data;

/* ----------------------------------
 * 거래 테이블 
---------------------------------- */
@Data
public class TradeDTO {
	private String 	side; 		// 매도 / 매수 구분 
	private int 	quantity; 	// 거래 수량 
	private Long 	price; 		// 가격
	private String 	created_at; // 체결시간 
}
