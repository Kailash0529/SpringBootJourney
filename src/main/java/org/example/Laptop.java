package org.example;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    private int id;  // Unique identifier for Laptop

    private String model;
    private String ram;

    private String Storage;

    @ManyToMany
      // Foreign key column
    private List<Student> students= new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        students.add(student);
        student.setLaptops(this);
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram='" + ram + '\'' +
                ", model='" + model + '\'' +
                ", Storage='" + Storage + '\'' +
                '}';
    }
}
