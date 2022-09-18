package com.example.net.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


//Rest API
@RestController
public class HelloWorldContainer {
	
	@RequestMapping(method=RequestMethod.GET,path="/hello-world")
	public String helloWorld()
	{
		return "hello world";
	}
	

}
