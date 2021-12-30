package com.saulo.mendes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saulo.mendes.model.Course;

@Repository
public interface CursoRepository extends JpaRepository<Course, Long>{

}
