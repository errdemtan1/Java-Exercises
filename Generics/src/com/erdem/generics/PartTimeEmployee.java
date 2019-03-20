package com.erdem.generics;

public class PartTimeEmployee extends Employee{

    public PartTimeEmployee(String name, int workingHours) {
        super(name, workingHours);
    }

    @Override
    public void work() {
        System.out.println(getName() + " works "+ getWorkingHours() + " hours a day");
    }

    @Override
    int calculateSalary() {
        return getWorkingHours()*9;
    }
    
}
