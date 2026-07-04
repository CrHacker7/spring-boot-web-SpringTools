package com.divdev.springboot.web.app.controllers;

import org.springframework.beans.factory.annotation.Value;

//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import com.divdev.springboot.web.app.models.User;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${text.indexcontroller.index.title}")
	private String textIndex;
	
	@Value("${text.indexcontroller.profile.title}")
	private String textProfile;
	
	@Value("${text.indexcontroller.list.title}")
	private String textList;
	
	//1st most used
    //@RequestMapping(value= "/index", method=RequestMethod.GET) /more accurate
	@GetMapping({"/index", "/", "/home"})
	public String index(Model model) {
		model.addAttribute("title", textIndex);
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
	
//	@RequestMapping("/profile")
//	public String profile(Model model) {
//		
//		User user = new User();
//		user.setName("Frieren");
//		user.setLastname("Unchoa");
//		user.setEmail("frieren@mail.com");
//		
//		model.addAttribute("user", user);
//		model.addAttribute("title", textProfile.concat(user.getName()));
//		
//		return "profile";
//	}

	@RequestMapping("/list")
	public String list(Model model) {
		model.addAttribute("title", textList);
		return "list";
	}
	
	
	
	
	
	
}
