package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/Home")
	public String Home()
	{
		return "Home";
	}
	@GetMapping("/Contact")
	public String Contact()
	{
		return "Contact";
	}
	@GetMapping("/Sales")
	public String Sales()
	{
		return "Sales";
	}

}
