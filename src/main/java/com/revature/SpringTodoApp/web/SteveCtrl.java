package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SteveCtrl {

	@RequestMapping("/steve")
	public String steve() {
		System.out.println("SteveCtrl: make jar not war ");
		return "make jar not war";
	}
	
}
