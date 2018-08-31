package com.revature.FirstSpringBootMS.wen;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DanielCtrl {
	
		@RequestMapping("/daniel")
		public String daniel() {
			System.out.println("DanielCtrl: make jar not war");
			return "make jar not war";
		}

}
