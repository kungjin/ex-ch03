package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ExService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExController {
	
	ExService exService;
	public ExController(ExService exService) {
		this.exService = exService;
	}

//	@GetMapping("/")
//	public String getMethodName() {
//		return "루트 경로";
//	}
	
	@GetMapping("/")
	public String getMethodName() {
		return exService.sayHello("안녕");
	}
	
	@GetMapping("/ex321")
	public String getex321() {
		return exService.ex321();
	}
	
	@GetMapping("/ex322")
	public String getex322() {
		return exService.ex322();
	}
	
	@GetMapping("/ex323")
	public String getex323() {
		return exService.ex323();
	}
	
	@GetMapping("/ex324")
	public String getex324() {
		return exService.ex324();
	}
	
	@GetMapping("/ex325")
	public String getex325() {
		return exService.ex325();
	}
	
	@GetMapping("/ex326")
	public String getex326() {
		return exService.ex326();
	}
	
	@GetMapping("/ex327")
	public String getex327() {
		return exService.ex327();
	}
	
	
}
