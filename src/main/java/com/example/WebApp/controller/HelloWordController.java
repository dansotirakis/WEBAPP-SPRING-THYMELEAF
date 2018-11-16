package com.example.WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HelloWordController {
	
	@GetMapping
	public ModelAndView index(Model model) {
		ModelAndView mv = new ModelAndView("/hello");
		return mv;
	}

}
