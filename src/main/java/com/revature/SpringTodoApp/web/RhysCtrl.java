package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RhysCtrl {

	@RequestMapping("/rhys")
	public String rhys() {
		System.out.println("RhysCtrl: make jar not war");
		return "make jar not war";
	}
}
