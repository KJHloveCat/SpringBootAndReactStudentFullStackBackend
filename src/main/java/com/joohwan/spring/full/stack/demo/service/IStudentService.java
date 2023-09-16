package com.joohwan.spring.full.stack.demo.service;

import com.joohwan.spring.full.stack.demo.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
