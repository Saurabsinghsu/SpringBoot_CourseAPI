package com.springCource.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController 
{
	@GetMapping("/hello")
	public Test hello()
	{	
		System.out.println("sdsds----------------->");
		return new Test("From first controller", null) ;
	}
	
	class Test{
		
		private String name;
		private Integer age;
		
		public Test(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		
	}
}
