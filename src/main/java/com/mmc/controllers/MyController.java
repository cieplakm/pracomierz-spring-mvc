
package com.mmc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/home")
	public String showWelcomeScreen(Model model) {
		model.addAttribute("name", "Mateusz!");
		
		return "welcome";
	}
}
