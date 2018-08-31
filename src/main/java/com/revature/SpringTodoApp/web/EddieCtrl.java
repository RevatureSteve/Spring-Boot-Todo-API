package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EddieCtrl {
	
	@RequestMapping("/eddie")
	public String eddie() {
		System.out.println("EddieCtrl: Annie are you ok?");
		return "Annie are you ok?";
	}

}
