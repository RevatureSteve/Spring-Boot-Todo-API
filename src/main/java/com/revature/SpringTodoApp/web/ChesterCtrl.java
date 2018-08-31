package com.revature.SpringTodoApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChesterCtrl {

	@RequestMapping("/chester")
    public String chester() {
        System.out.println("ChesterCtrl: welcome time is almost up");
        return "welcome up juda";
    }
}
