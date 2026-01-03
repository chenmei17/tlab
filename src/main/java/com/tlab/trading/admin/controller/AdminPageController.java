package com.tlab.trading.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tlab/admin")
public class AdminPageController {
	
	@GetMapping("/dashboard")
	  public String dashboard() {
	    return "admin/dashboard"; // /WEB-INF/views/admin/dashboard.jsp
	  }

}
