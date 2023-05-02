package com.geekster.govinda.UniversityEventManagement.service;

import com.geekster.govinda.UniversityEventManagement.model.Student;
import com.geekster.govinda.UniversityEventManagement.repository.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    @Autowired
    StudentDao studentDao;


    public Iterable<Student> getAllStudent(){
        Iterable<Student> allStudent=studentDao.findAll();
        return allStudent;
    }

    public Optional<Student> findById(Long studentId) {

        return studentDao.findById(studentId);


    }

    public String addAllstudent(List<Student> studentList) {

        Iterable<Student> addedStudent=studentDao.saveAll(studentList);

        if(addedStudent !=null)

            return "yes";
        else
            return "No";
    }

    public void deleteById(Long studentId) {
        studentDao.deleteById(studentId);
    }
}
