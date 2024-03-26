package com.vamshi.education.repo;

import com.vamshi.education.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepo extends JpaRepository<Student, Long> {
}
