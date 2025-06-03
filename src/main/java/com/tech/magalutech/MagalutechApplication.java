package com.tech.magalutech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MagalutechApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagalutechApplication.class, args);
	}

}
