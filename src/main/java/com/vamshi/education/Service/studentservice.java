package com.vamshi.education.Service;

import com.vamshi.education.Model.Student;
import com.vamshi.education.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class  studentservice {

    private final Studentrepo studentrepo;

    @Autowired
    public studentservice(Studentrepo studentrepo) {
        this.studentrepo = studentrepo;
    }
List<Student>mystudent=new ArrayList<Student>();
    public Student save(Student student) {
        return studentrepo.save(student);
    }
}
