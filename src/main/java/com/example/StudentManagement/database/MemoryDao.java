package com.example.StudentManagement.database;

import com.example.StudentManagement.domain.Student;

import java.util.ArrayList;
import java.util.List;

public class MemoryDao {

    public List<Student> studentList=new ArrayList<>();

    public boolean save(Student s) {
        return this.studentList.add(s);
    }

    public List<Student> readAll() {

        return this.studentList;
    }

    public void delete(Student s) {
        this.studentList.remove(s);

    }

    public Student findOne(String name) {
        for (Student student :this.studentList){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public void update(Student student) {
        int indexOf = this.studentList.indexOf(student);
        this.studentList.set(indexOf,student);
    }
}
