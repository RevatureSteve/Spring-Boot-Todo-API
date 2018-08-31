package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;

@Controller
public class JoeyCtrl {

@RequestMappong("/joey")
	public String joey() {
	
	System.out.println("My dad is mom");
	
	return "Make the beep boop not the diddly boop";
}
	
	
}
