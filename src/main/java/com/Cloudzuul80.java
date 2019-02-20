package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
public class Cloudzuul80 {
	public static void main(String[] args) {
		SpringApplication.run(Cloudzuul80.class, args);
	}
}

// public class ZjzxBootControllerApplication extends
// SpringBootServletInitializer{
// @Override
// protected SpringApplicationBuilder configure(
// SpringApplicationBuilder builder) {
// // TODO Auto-generated method stub
// return builder.sources(ZjzxBootControllerApplication.class);
// }
// public static void main(String[] args) {
// SpringApplication.run(ZjzxBootControllerApplication.class, args);
// }
// }

