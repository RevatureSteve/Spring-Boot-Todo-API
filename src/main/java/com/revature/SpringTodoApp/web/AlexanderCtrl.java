package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlexanderCtrl {
	
	@RequestMapping("/alexander")
	public  String alexander() {
		System.out.println("AlexanderCtrl: Alexander The Great ");
		return "Alexander The Great";
	}

}
