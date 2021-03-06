package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/helloworld")
	public String welcome(String name, Model model) {
		System.out.println("name: " + name);
		model.addAttribute("name", name);
		return "welcome";
	}
}
