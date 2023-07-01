package com.geekster.universityeventmanagement.repository;

import com.geekster.universityeventmanagement.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Long> {
}
