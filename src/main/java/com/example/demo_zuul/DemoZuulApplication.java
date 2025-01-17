package com.example.demo_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class DemoZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoZuulApplication.class, args);
	}

}
