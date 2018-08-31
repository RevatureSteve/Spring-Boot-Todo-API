package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrakeCtrl {
	
	@RequestMapping("/drake")
	public String drake() {
		System.out.println("DrakeCtrl: MY branch");
		return "MY branch";
	}

}
