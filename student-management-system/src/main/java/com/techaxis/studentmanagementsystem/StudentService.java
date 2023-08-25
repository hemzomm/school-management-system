package com.techaxis.studentmanagementsystem;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(10,"Ram","ram@gmail.com","98472398","Kathmandu","2020"),
                new Student(20,"Ram","ram@gmail.com","98472398","Kathmandu","2020"),
                new Student(30,"Ram","ram@gmail.com","98472398","Kathmandu","2020")


        );
    }
}
