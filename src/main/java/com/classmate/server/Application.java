package com.classmate.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.classmate.server.config.Config;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Config.class, args);
	}

}
