package com.msday1application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class homecontroller {

	@GetMapping("/getAdm")
	public String getData()
	{
		return "Welcome to Admission app!!";
	}
}
