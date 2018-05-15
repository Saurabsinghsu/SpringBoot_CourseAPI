package com.springCource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController 
{
	@GetMapping("/2")
	public String fromSecondController()
	{
		System.out.println("<<<<<<<<<<---------2nd---------->>>>>>>>>>>>");
		return "Its a call from second controller";
	}
}
