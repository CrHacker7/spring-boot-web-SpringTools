package com.divdev.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
//		return "redirect:/app/index"; //url changes to localhost:8080/app/index
		return "forward:/app/index"; //url is unchanged: localhost:8080. Not allowed to external pages
	}
}
