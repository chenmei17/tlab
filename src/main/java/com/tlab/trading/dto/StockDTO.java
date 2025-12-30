package com.tlab.trading.dto;

import lombok.Data;

/* ----------------------------------
 * 종목 정보 테이블 
---------------------------------- */
@Data
public class StockDTO {
	private int			stock_id;
	private String		symbol;
	private String		name;
	private int			base_price;
	private int			current_price;
	private String		created_at;
}
