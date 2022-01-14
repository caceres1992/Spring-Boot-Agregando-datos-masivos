package com.example.excelimportexport.services;

import com.example.excelimportexport.model.Student;
import com.example.excelimportexport.repository.RepositoryStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ServicesStudent {


    @Autowired
    private RepositoryStudent repositoryStudent;

    //    get students
    public List<Student> getStudent() {
        return repositoryStudent.findAll();
    }

    public List<Student> saveStudetns(List<Student> students) {
        List<Student> newStudent = new ArrayList<>();
        newStudent.addAll(students.stream().filter(student -> !repositoryStudent.existsByDni(student.getDni())).collect(Collectors.toList()));
        return repositoryStudent.saveAll(newStudent);
    }

    public List<Student> alreadyStudent(List<Student> students){
        List<Student> newStudent = new ArrayList<>();
        newStudent.addAll(students.stream().filter(student -> repositoryStudent.existsByDni(student.getDni())).collect(Collectors.toList()));
       return newStudent;
    }

}
