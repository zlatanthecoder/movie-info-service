package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient this is not mandatory now as adding client dependencies into the classpath is enough to make it a eureka client
public class MovieInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
