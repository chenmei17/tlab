package com.tlab.trading.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tlab.trading.admin.dto.response.AssetTradeStatDTO;

@Repository
public class MybatisDashboardDAO implements DashboardDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public int selectTodayAlertCount() {
		return sqlSessionTemplate.selectOne("Dashboard.selectTodayAlertCount");
	}

	@Override
	public int selectTodayTradeCount() {
		return sqlSessionTemplate.selectOne("Dashboard.selectTodayTradeCount");

	}

	@Override
	public List<AssetTradeStatDTO> selectAssetTradeStats() {
		return sqlSessionTemplate.selectList("Dashboard.selectAssetTradeStats");

	}

}
