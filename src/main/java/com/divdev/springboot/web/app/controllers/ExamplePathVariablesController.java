package com.divdev.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class ExamplePathVariablesController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("title", "Send params from path (@PathVariabe)");
		return "variables/index";
	}
	
	@GetMapping("/string/{text}")
	public String variables(@PathVariable String text, Model model) {
		model.addAttribute("title", "Receive params from path (@PathVariabe)");
		model.addAttribute("result", "The text sent in the path is: '" + text + "'");
		return "variables/view";
	}
	
	@GetMapping("/string/{text}/{number}")
	public String variables(@PathVariable String text, @PathVariable Integer number, Model model) {
		model.addAttribute("title", "Receive params from path (@PathVariabe)");
		model.addAttribute("result", "The text sent in the path is: '" + text + "'"
				+ "the number sent int the path is: '" + number + "'");
		return "variables/view";
	}
}
