package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/")
	public String home() {
		return "account-service - " + port;
	}

}
