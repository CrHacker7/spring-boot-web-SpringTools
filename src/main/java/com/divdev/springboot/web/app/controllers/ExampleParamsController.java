package com.divdev.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/params")
public class ExampleParamsController {

	@GetMapping("/")
	public String index() {
		return "params/index";
	}
	
	@GetMapping("/string")
	public String param(@RequestParam(required=false, defaultValue = "youkoso Nezuko san") String text, Model model) {
		model.addAttribute("result", "The text sent is: " + text);
		return "params/view";
	}
	
	@GetMapping("/mix-params")
	public String param(@RequestParam String greetings, @RequestParam Integer number, Model model) {
		model.addAttribute("result", "The greeting is sent: '" + greetings + "' soshite sūji wa: '" + number + "' desu");
		return "params/view";
	}
	
	@GetMapping("/mix-params-request")
	public String param(HttpServletRequest request, Model model) {
		String greetings = request.getParameter("greetings");
		Integer number = null;
		try {
		number = Integer.parseInt(request.getParameter("number"));
		} catch(NumberFormatException e) {
			number = 0;
		}
		model.addAttribute("result", "The greeting is sent: '" + greetings + "' soshite sūji wa: '" + number + "' desu");
		return "params/view";
	}
}
