package com.org.figen;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "GREET-API")
public interface FeignApp {

	@GetMapping("/greet")
	public String invokeGreet();
	
	@GetMapping("/welcome")
	public String invokeWelcome();
}
