package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class homeController {
	
	
@GetMapping({"/", "/index", "/home"})
public String index() {
	
	return "home";
}

}
