package com.erdem.generics;

public abstract class Employee {
    
    private String name;
    private int workingHours;
    private int hourlySalary;
    
    public Employee(String name, int workingHours) {
        this.name = name;
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    abstract void work();
    abstract int calculateSalary();
}
