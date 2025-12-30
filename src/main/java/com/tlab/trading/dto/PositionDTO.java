package com.tlab.trading.dto;


/* ----------------------------------
 * 회원별 보유종목 현황 
---------------------------------- */
public class PositionDTO {
	private int			position_id;
	private int			user_id;
	private int			stock_id;
	private String		updated_at;
	private int			quantity;
	private int			avg_price;
}
