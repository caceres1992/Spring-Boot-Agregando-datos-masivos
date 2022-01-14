package com.example.excelimportexport.repository;

import com.example.excelimportexport.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface RepositoryStudent  extends JpaRepository<Student,Long> {

    boolean existsByDni(String dni);
//   List<Student> existsByDni(String dni);
}
