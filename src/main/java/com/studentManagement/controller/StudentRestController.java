package com.studentManagement.controller;

import com.studentManagement.model.Student;
import com.studentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    StudentService service;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam String susername){
        return service.getStudent(susername);
    }
    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody Student student) {
        service.addStudent(student);
        return ResponseEntity.ok("Student added successfully");
    }

    @PutMapping("/updateStudent")
    public ResponseEntity<String> updateStudent(@RequestBody Student updatedStudent){
        service.updateStudent(updatedStudent);
        return ResponseEntity.ok("Student Updated Successfully");
    }

    @DeleteMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudent(@RequestParam String deleteUsername){
        service.deleteStudent(deleteUsername);
        return ResponseEntity.ok("Student Deleted Successfully");
    }



    @GetMapping("/hello")
    public void hello(){
        System.out.println("Hello");
    }
}
