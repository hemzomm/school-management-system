package com.techaxis.studentmanagementsystem;


import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


public class Student {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String dob;
}
