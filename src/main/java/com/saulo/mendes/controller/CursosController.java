package com.saulo.mendes.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saulo.mendes.model.Course;
import com.saulo.mendes.repositories.CursoRepository;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/courses")
@Component
@AllArgsConstructor
public class CursosController {
	

	private final CursoRepository cursoRepository;
	
	@GetMapping
	public List<Course> list() {
		return cursoRepository.findAll();
	}
}
