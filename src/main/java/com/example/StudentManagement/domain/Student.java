package com.example.StudentManagement.domain;


public class Student {

    private String name;
    private Integer phoneNumber;
    private String email;
    private Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}


