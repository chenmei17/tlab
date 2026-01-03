package com.tlab.trading.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tlab.trading.admin.dto.response.AdminDashboardResponseDTO;
import com.tlab.trading.admin.service.DashboardService;

@Controller
@RequestMapping("/api/admin")
public class AdminDashboardController {
	@Autowired
	private DashboardService dashboardService;
	
	@ResponseBody
	@GetMapping("/dashboard")
	public AdminDashboardResponseDTO  dashboard() {
		AdminDashboardResponseDTO res = new AdminDashboardResponseDTO();
	    res.setTodayAlertCount(dashboardService.selectTodayAlertCount());
	    res.setTodayTradeCount(dashboardService.selectTodayTradeCount());
	    res.setAssetTradeStats(dashboardService.selectAssetTradeStats());
	    return res;
	}
	

}
