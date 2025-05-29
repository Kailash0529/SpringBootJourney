package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int sid;
    private String name;
    private int age;

    @ManyToMany
    private List<Laptop> laptops= new ArrayList<>();



    public int getSid() {
        return sid;
    }

    public void setSid(int rollNo) {
        this.sid = rollNo;
    }

    public String getName() {
        return name;
    }


    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(Laptop laptop) {
        this.laptops.add(laptop) ;
        laptop.getStudents().add(this);

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", laptop=" + laptops +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }


}
