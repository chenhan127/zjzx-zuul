package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
@SpringBootApplication
@EnableZuulProxy
public class Cloudzuul80 {
	public static void main(String[] args) {
		SpringApplication.run(Cloudzuul80.class, args);
	}
	
	@Bean
	public CorsFilter corsFilter() {
	    final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	    final CorsConfiguration config = new CorsConfiguration();
	    config.setAllowCredentials(true);
	    config.addAllowedOrigin("*");
	    config.addAllowedHeader("*");
	    config.addAllowedMethod("*");
	    config.setMaxAge(18000L);
	    source.registerCorsConfiguration("/**", config);
	    return new CorsFilter(source);
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

