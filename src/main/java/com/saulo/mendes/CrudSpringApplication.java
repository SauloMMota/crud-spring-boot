package com.saulo.mendes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.saulo.mendes.model.Course;
import com.saulo.mendes.repositories.CursoRepository;

@SpringBootApplication
public class CrudSpringApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}
	
	@Bean //Para o spring gerenciar todo o ciclo de vida
	CommandLineRunner initDatabase(CursoRepository cursoRepository) {

		return args -> {
			cursoRepository.deleteAll();
			cursoRepository.save(Course.builder().name("Angular com Spring")
					.category("Front-end").build());
		};
		
	}
}
