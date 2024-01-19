package com.itvedant.Employeee.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {

	@RequestMapping("/")
	public String index() {
		return "Spring Boot App";
	}
}
