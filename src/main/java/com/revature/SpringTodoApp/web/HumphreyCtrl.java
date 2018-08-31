package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HumphreyCtrl {
	
	@RequestMapping("/humphrey")
		public String humphrey() {
		System.out.println("HumphreyCtrl: humphreyHello");
		return "Hello World -humphrey";
	}

}
