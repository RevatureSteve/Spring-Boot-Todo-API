package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarcinCtrl {
	
	@RequestMapping("/marcin")
	public String marcin() {
		System.out.println("WHYYYYYYYYYYYY?");
		return "why not?";
	}
}
