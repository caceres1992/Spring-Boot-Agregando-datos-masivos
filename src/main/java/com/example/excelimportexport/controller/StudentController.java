package com.example.excelimportexport.controller;

import com.example.excelimportexport.model.Student;
import com.example.excelimportexport.services.ServicesStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000","https://demo-import-excel.netlify.app/"})
@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    ServicesStudent servicesStudent;

    @GetMapping
    public List<Student> getAll(){
      return servicesStudent.getStudent();
    }
    @PostMapping
    public List<Student> saveAllStudents(@RequestBody List<Student> students){
      return servicesStudent.saveStudetns(students);
    }

    @PostMapping("/already")
    public List<Student> alreadyStudent (@RequestBody List<Student> students){
       return servicesStudent.alreadyStudent(students);
    }

}
