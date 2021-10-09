package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"https://jibtest-lhefrhbyia-uc.a.run.app","http://localhost:8080"}, maxAge = 3600)
@RestController
@RequestMapping(path="api/gfactory")
public class GreetFactory {
	
	@GetMapping
	public Greeting manufacture() {
		return new Greeting("From Greet factory","Lets get Istio working");
	}
}
