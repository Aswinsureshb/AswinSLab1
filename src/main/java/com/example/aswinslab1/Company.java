package com.example.aswinslab1;

public class Company {

    private int id;
    private String name;
    private String owner;
    private int age;
    private int employeenumber;

    public Company(int id, String name, String owner, int age, int employeenumber) {
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.age = age;
        this.employeenumber = employeenumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(int employeenumber) {
        this.employeenumber = employeenumber;
    }
}
