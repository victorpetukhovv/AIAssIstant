package com.aiassistant.aiassistant;

import com.aiassistant.aiassistant.dao.UserDao;
import com.aiassistant.aiassistant.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication
public class AiassistantApplication {

	Logger log = Logger.getLogger(AiassistantApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(AiassistantApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(UserDao repository) {
		return (args) -> {
			// save a few customers
			repository.save(new User("jacky", "123"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			repository.findAll().forEach(customer -> {
				log.info(customer.toString());
			});
		};
	}

}


