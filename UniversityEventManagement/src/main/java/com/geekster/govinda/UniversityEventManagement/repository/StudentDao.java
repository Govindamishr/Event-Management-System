package com.geekster.govinda.UniversityEventManagement.repository;

import com.geekster.govinda.UniversityEventManagement.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentDao extends CrudRepository<Student,Long> {

}
