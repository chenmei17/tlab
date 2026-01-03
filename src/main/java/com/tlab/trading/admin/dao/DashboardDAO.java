package com.tlab.trading.admin.dao;

import java.util.List;

import com.tlab.trading.admin.dto.response.AssetTradeStatDTO;

public interface DashboardDAO {
	public int selectTodayAlertCount();
	public int selectTodayTradeCount(); 
	public List<AssetTradeStatDTO> selectAssetTradeStats(); 

}
