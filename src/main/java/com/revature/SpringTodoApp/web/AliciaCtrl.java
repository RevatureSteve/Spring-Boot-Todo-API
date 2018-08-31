package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AliciaCtrl {

	@RequestMapping("/alicia")
	public String alicia() {
		System.out.println("AliciaCtrl: Hello!");
		return "Hello!";
	}
	
}
