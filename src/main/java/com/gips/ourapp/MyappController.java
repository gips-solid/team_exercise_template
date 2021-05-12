package com.gips.ourapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyappController {
	@RequestMapping("/")
	String home() {
		return "Hello SpringBoot!";
	}
}
