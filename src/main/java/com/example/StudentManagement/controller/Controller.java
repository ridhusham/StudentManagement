package com.example.StudentManagement.controller;
import com.example.StudentManagement.database.MemoryDao;
import com.example.StudentManagement.domain.Student;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private MemoryDao memoryDao=new MemoryDao();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping("/listStudent")
    public List<Student> listAllStudent() {
        return this.memoryDao.readAll();
    }

    @GetMapping("/addStudent/{name,phoneNumber,email,address}")
    public boolean addStudent(@PathVariable String name,int phoneNumber,String email){
        Student student=new Student();
        student.setName(name);
        student.setPhoneNumber(phoneNumber);
        student.setName(email);
        System.out.println(student);
        return this.memoryDao.save(student);
    }

    @GetMapping("/findStudent/{name}")
    public Student findStudent(@PathVariable String name){
       return this.memoryDao.findOne(name);
    }


}
