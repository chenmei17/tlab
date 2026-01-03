package com.tlab.trading.admin.service;

import java.util.List;

import com.tlab.trading.admin.dto.request.AdminUserPageRequestDTO;
import com.tlab.trading.admin.dto.row.AdminUserRowDTO;

public interface AdminUserService {
	public List<AdminUserRowDTO> selectAdminUsers(AdminUserPageRequestDTO req);

}
