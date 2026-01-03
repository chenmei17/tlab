package com.tlab.trading.admin.dao;

import java.util.List;

import com.tlab.trading.admin.dto.request.AdminUserPageRequestDTO;
import com.tlab.trading.admin.dto.row.AdminUserRowDTO;

public interface AdminUserDAO {
	public List<AdminUserRowDTO> selectAdminUsers(AdminUserPageRequestDTO req);

}
