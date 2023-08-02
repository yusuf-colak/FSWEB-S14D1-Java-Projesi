package com.workintech.inheritance.mathModel.mathModel.developerCompany;

public class MidDeveloper extends JuniorDeveloper {
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    public void Work(){
        setSalary(25000);
        System.out.println( super.getName()+" mid begins to work.  Salary= " + getSalary());

    }
}
