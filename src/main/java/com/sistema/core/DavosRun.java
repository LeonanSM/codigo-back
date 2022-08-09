package com.sistema.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class DavosRun {

	public static void main(String[] args) {
		SpringApplication.run(DavosRun.class, args);
	}

}
