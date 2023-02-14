package com.example.studentmanagementsystem.repositories;

import com.example.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
