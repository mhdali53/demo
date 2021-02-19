package com.yasir.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasir.school.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
