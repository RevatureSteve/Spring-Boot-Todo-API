package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BeckCtrl {

	@RequestMapping("/beck")
	public String steve() {
		System.out.println("BeckCtrl: AHHHHHHHHHHHHHHHHHHHHHH");
		return "OOOHHHHHH";
	}
}
