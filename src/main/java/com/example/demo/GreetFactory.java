package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/gfactory")
public class GreetFactory {
	
	@GetMapping
	public Greeting manufacture() {
		return new Greeting("From Greet factory","Lets get Istio working");
	}
}