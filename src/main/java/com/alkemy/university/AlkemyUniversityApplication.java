package com.alkemy.university;

import com.alkemy.university.repository.DAOUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AlkemyUniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlkemyUniversityApplication.class, args);
	}

}
