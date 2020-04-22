package com.info.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //by default the properties values will be read by the classpath
public class AppConfig {
	
	@Value("${moviedb.service.url}")
	public String movieDbServiceUrl; 
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
