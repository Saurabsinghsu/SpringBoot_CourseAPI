package com.springCourc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.springCource.*"})
public class SpringCourceApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SpringCourceApplication.class, args);
	}
}
