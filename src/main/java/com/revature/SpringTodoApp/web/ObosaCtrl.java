package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ObosaCtrl {
	
	    
	    @RequestMapping("/obosa")
	    public String obosa() {
	        System.out.println("ObosaCtrl: Annie is deffs ok?");
	        return "Annie is deffs ok?";
	    }

}
