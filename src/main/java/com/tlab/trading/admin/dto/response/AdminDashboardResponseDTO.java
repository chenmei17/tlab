package com.tlab.trading.admin.dto.response;

import java.util.List;

import lombok.Data;

@Data
public class AdminDashboardResponseDTO {
	private int todayAlertCount; 
	private int todayTradeCount; 
	private List<AssetTradeStatDTO> assetTradeStats;

}
