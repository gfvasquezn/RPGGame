package com.poli.game.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan (basePackages="com.poli.game.main,servicios,com.poli.game.entities,com.poli.game.repositories,com.poli.game.servicios")
@EntityScan(basePackages = {"com.poli.game.entities"}) 
@EnableJpaRepositories ("com.poli.game.repositories")
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}

