package com.jparetrive.retiveformtable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentRepo studentRepo;
    
    @GetMapping("/returnValues")

    public List<Student> getAllStudents(){
        List<Student> students=studentRepo.findAll();
         return students; 
         
     }

}
