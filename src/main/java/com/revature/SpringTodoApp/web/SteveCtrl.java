package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SteveCtrl {
	
	@RequestMapping("/richard")
	public String steve() {
		System.out.println("RichardCtrl: Hi");
		return "make jar not war";
	}
	
}
