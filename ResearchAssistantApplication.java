package com.research.assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ResearchAssistantApplication {

	public static void main(String[] args) {

		SpringApplication.run(ResearchAssistantApplication.class, args);
	}

}
