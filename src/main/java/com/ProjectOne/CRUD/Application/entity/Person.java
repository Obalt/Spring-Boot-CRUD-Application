package com.ProjectOne.CRUD.Application.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person")
public class Person  {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String mobile;

    private String dob;

    public Person () {

    }

    public Person(long id, String name, String mobile, String dob) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
