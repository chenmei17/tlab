package com.tlab.trading.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tlab.trading.admin.dto.request.AdminUserPageRequestDTO;
import com.tlab.trading.admin.dto.row.AdminUserRowDTO;
import com.tlab.trading.admin.service.AdminUserService;

@Controller
@RequestMapping("/api/admin")
public class AdminUserController {
	@Autowired
	private AdminUserService adminUserService;
	
	@GetMapping("/users")
	@ResponseBody
	public List<AdminUserRowDTO> users(@ModelAttribute AdminUserPageRequestDTO req) {
		req.normalize();
		return adminUserService.selectAdminUsers(req); 
	}
	

}
