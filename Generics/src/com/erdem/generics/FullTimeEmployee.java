package com.erdem.generics;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int workingHours) {
        super(name, workingHours);
    }

    @Override
    public void work() {
        System.out.println(getName() + " works "+ getWorkingHours() + " hours a day");
    }

    @Override
    int calculateSalary() {
        return getWorkingHours()*15;
    }

}
