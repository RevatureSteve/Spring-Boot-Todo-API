package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlexCtrl {

	@RequestMapping("/alex")
	public String alex() {
		System.out.println("AlexCtrl: Hola!");
		return "Hola";
	}
}
