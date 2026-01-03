package com.tlab.trading.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tlab.trading.admin.dto.request.AdminUserPageRequestDTO;
import com.tlab.trading.admin.dto.row.AdminUserRowDTO;

@Repository
public class MybatisAdminUserDAO implements AdminUserDAO{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<AdminUserRowDTO> selectAdminUsers(AdminUserPageRequestDTO req) {
		
		return sqlSessionTemplate.selectList("AdminUser.selectAdminUsers",req);
	}

}
