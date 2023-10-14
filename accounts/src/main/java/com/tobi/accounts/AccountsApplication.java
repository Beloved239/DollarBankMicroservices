package com.tobi.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "DollarBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Oluwatobi Adebanjo",
						email = "adettob@gmail.com",
						url = "https://beloved239.github.io/profile/"
				),
				license = @License(
						name = "LinkedIn Profile",
						url = "https://www.linkedin.com/in/adebanjo-oluwatobi-6bb25b156/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "DollarBank Accounts microservice REST API Documentation",
				url = "https://www.dollarbank.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
