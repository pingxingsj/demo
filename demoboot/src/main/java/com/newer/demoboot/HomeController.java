package com.newer.demoboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// 这是页面
	
	@GetMapping
	public String home() {
		return "home";
	}
	
}
