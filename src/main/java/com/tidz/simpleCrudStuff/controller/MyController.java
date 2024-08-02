package com.tidz.simpleCrudStuff.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

	@GetMapping
	public String getName() {
		return "Tiago Diniz Gomes";
	}
}
