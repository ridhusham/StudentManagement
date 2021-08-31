package com.example.StudentManagement.controller;
import com.example.StudentManagement.database.MemoryDao;
import com.example.StudentManagement.domain.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    private MemoryDao memoryDao=new MemoryDao();

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/test")
    public String indexTest() {
        return "Hello test";
    }


    @RequestMapping("/listStudenxt")
    public List<Student> listAllStudent() {
        return this.memoryDao.readAll();
    }

    @GetMapping("/addStudent/{name}")
    public boolean addStudent(@PathVariable String name){
        Student student=new Student();
        student.setName(name);
        System.out.println(student);
        return this.memoryDao.save(student);
    }

    @GetMapping("/findStudent/{name}")
    public Student findStudent(@PathVariable String name){
       return this.memoryDao.findOne(name);
    }




}
