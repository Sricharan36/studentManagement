package com.studentManagement.service;

import com.studentManagement.model.Student;
import com.studentManagement.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudent(String susername) {
        return repo.findBySusername(susername);
    }

    public void addStudent(Student student) {
        try{
            repo.save(student);
        } catch (DataIntegrityViolationException e){
            throw new IllegalArgumentException("Username Already Exists");
        }
    }

    public void updateStudent(Student updatedStudent) {
        try{
            repo.save(updatedStudent);
        } catch (DataIntegrityViolationException e) {
            throw new IllegalArgumentException("Username Not Found");
        }
    }

    public void deleteStudent(String deleteUsername) {
        Student student = repo.findBySusername(deleteUsername);
        if(student != null){
            repo.delete(student);
        }
        else
            throw new IllegalArgumentException("Username Not Found");
    }
}
