package com.workintech.inheritance.mathModel.mathModel.developerCompany;

public class Employee {

    private int id;
    private String name;
private double salary;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void Work(){
        System.out.println("Employee starts to working");
    }
}
