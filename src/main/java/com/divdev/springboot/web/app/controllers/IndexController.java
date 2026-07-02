package com.divdev.springboot.web.app.controllers;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	//1st most used
    //@RequestMapping(value= "/index", method=RequestMethod.GET) /more accurate
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("title", "Konnichiwa Spring San!");
		return "index";
		
	}
	
	//2nd
//	@GetMapping({"/index", "/", "/home"})
//	public String index(Map<String, Object> map) {
//		map.put("title", "Konnichiwa Spring San Mapu San to!");
//		return "index";
//		
//	}
	
	//3th
//	@GetMapping({"/index", "/", "/home"})
//	public ModelAndView index(ModelAndView mv) {
//		mv.addObject("title", "Konnichiwa Spring San ModelAndView San to!");
//		mv.setViewName("index");
//		return mv;
//		
//	}

}
