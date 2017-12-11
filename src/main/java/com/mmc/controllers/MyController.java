
package com.mmc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
public class MyController {
	
	@GetMapping("/login")
	public String showWelcomeScreen(Model model) {
		model.addAttribute("name", new Names());
		return "login";
	}
	
	@PostMapping("/login")
	public String showLoginScreen(@ModelAttribute Names name) {
		return "welcome";
	}
}
