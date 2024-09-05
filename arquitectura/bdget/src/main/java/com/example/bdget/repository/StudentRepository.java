package com.example.bdget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bdget.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
