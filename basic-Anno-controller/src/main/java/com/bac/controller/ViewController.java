package com.bac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController  {
	@RequestMapping("/welcome-controller.htm")
	public String welcomeController() {
		return "welcome-controller";
		
	}

}
