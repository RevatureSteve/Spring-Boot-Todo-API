package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChineduCtrl {
	
	@RequestMapping("/chinedu")
	public String chinedu() {
		System.out.println("Chinedu: Hello");
		return "Make war not jar";
	}

}
