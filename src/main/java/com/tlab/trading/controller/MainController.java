package com.tlab.trading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/tlab")
	@ResponseBody
	public String main() {
		return "TLAB";
	}

}

