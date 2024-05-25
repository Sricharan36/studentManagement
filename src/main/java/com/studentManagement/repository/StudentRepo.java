package com.studentManagement.repository;

import com.studentManagement.model.Student;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Id> {
    Student findBySusername(String susername);
}
