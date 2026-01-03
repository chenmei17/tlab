package com.tlab.trading.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tlab.trading.admin.dao.AdminUserDAO;
import com.tlab.trading.admin.dto.request.AdminUserPageRequestDTO;
import com.tlab.trading.admin.dto.row.AdminUserRowDTO;

@Service
public class AdminUserServiceImpl implements AdminUserService{
	@Autowired
	private AdminUserDAO adminUserDAO;

	@Override
	public List<AdminUserRowDTO> selectAdminUsers(AdminUserPageRequestDTO req) {

		return adminUserDAO.selectAdminUsers(req);
	}

}
