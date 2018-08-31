package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	public class NisatCtrl {

	@RequestMapping("/nisat")
	public String nisat() {
	System.out.println("NisatCtrl: eat donuts");
	return "eat donuts";
		
	
	}
}