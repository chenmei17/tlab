package com.tlab.trading.admin.service;

import java.util.List;

import com.tlab.trading.admin.dto.response.AssetTradeStatDTO;

public interface DashboardService {
	
	public int selectTodayAlertCount();
	public int selectTodayTradeCount(); 
	public List<AssetTradeStatDTO> selectAssetTradeStats(); 

}
