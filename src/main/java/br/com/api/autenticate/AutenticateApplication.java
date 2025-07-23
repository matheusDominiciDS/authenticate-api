package br.com.api.autenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AutenticateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutenticateApplication.class, args);
	}

}
