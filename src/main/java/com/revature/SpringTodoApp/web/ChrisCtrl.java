package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChrisCtrl {

	@RequestMapping("/chris")
	public String chris() {
		System.out.println("ChrisCtrl: big 1400");
		return "big 1400";
	}
}
