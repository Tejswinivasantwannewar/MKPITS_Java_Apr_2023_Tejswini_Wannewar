package com.example.postMappingToDatabase.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee_Course")
public class Courses {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String title;

    public Courses() {
    }

    public Courses(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Courses(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
