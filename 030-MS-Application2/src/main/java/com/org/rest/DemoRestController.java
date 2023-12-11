package com.org.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.figen.FeignApp;

@RestController
public class DemoRestController {
	
	@Autowired
	private FeignApp feign;

	@GetMapping("/work")
	public String work() {
		String greet = feign.invokeGreet();
		
		return greet +", Do hard work";
	}
}
