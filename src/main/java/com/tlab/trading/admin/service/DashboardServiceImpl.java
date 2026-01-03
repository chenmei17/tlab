package com.tlab.trading.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlab.trading.admin.dao.DashboardDAO;
import com.tlab.trading.admin.dto.response.AssetTradeStatDTO;

@Service
public class DashboardServiceImpl implements DashboardService{
	@Autowired
	private DashboardDAO dashboardDAO;

	@Override
	public int selectTodayAlertCount() {
		
		return dashboardDAO.selectTodayAlertCount();
	}

	@Override
	public int selectTodayTradeCount() {
		return dashboardDAO.selectTodayTradeCount();
	}

	@Override
	public List<AssetTradeStatDTO> selectAssetTradeStats() {
		return dashboardDAO.selectAssetTradeStats();
	}

}
