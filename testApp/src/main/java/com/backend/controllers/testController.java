package com.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	private String index(){
		return "welcome";
	}
	
}
