package com.examly.examplyProjectPrac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controllerClass {
	
	@GetMapping(value="/")
	public ModelAndView home() {
		return new ModelAndView("home", "command", new Users());
	}
	
	@PostMapping(value="submitAction")
	public ModelAndView submitAction(@ModelAttribute Users users) {
		if(users.getUname().equals("fresherpro") && users.getPass().equals("fresherpro")) {
			return new ModelAndView("welcome", "command", users);
		}
		return new ModelAndView("home", "command", new Users());
	}
	
	@GetMapping(value="logout")
	public ModelAndView logout() {
		return home();
	}
}
