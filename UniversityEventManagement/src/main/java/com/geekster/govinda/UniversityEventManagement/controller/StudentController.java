package com.geekster.govinda.UniversityEventManagement.controller;

import com.geekster.govinda.UniversityEventManagement.model.Student;
import com.geekster.govinda.UniversityEventManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentManager")

public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping("/student")

    public Iterable<Student>getAll(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{studentId}")
    public Optional<Student> findById(@PathVariable Long studentId ){

        return studentService.findById(studentId);
    }
    @PostMapping(value="/postStudent")

    public String addStudent(@RequestBody List<Student> studentList ){

        return studentService.addAllstudent(studentList);

    }

    @DeleteMapping(value="/student/{studentId}")

    public String deleteById(@PathVariable Long studentId){
        studentService.deleteById(studentId);
        return "Student Delete SuccessFully !!!!!!";
    }




}
