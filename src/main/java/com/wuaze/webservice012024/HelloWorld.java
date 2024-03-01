package com.wuaze.webservice012024;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wuaze.webservice012024.repository.HelloWorldRepository;

@RestController
public class HelloWorld {
	
	@Autowired
	private HelloWorldRepository helloWorldRepository;
	
	@RequestMapping("/hello")
	public String hello() {
		return helloWorldRepository.findById(1L).get().getValue();
	}
}
