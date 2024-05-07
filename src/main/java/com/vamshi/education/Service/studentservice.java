package com.vamshi.education.Service;

import com.vamshi.education.Model.Student;
import com.vamshi.education.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class studentservice {
    @Autowired
    Studentrepo studentrepo;
    public void save(Student student) {
    studentrepo.save(student);
    }
}
