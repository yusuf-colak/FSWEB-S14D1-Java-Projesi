package com.workintech.inheritance.mathModel.mathModel.developerCompany;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }
    @Override
    public void Work(){
        setSalary(20000);
        System.out.println( super.getName()+" junior begins to work.  Salary= " + getSalary());
    }

}
