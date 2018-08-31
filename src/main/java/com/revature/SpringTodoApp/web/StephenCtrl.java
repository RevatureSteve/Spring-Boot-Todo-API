package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StephenCtrl {
	
	@RequestMapping("/stephen")
	public String stephen() {
		System.out.println("StephenCtrl: make jar not war ");
		return "make jar not war";
	}

}
