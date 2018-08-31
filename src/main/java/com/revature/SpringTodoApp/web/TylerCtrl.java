package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TylerCtrl {

	@RequestMapping("/tyler")
	public String tyler() {
		System.out.println("TylerCtrl: message mc messageface");
		return "message mc messageface";
	}
}
