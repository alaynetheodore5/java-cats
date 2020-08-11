package com.codingdojo.cats.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/cats/list")
	public String[] catsList() {
		return new String[] {
					"Garfield",
					"Cat in the Hat",
					"Sassy"
		};
	}
}
