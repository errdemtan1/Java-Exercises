package com.erdem.generics;

public class Generics {

    public static void main(String[] args) {
        
        FullTimeEmployee FTEmployee = new FullTimeEmployee("Erdem", 10);
        PartTimeEmployee PTEmployee = new PartTimeEmployee("Hakan", 5);
        
        work(FTEmployee);
        work(PTEmployee);
        calculateSalary(FTEmployee);
        calculateSalary(PTEmployee);
    }
    
    public static <T extends Employee> void work(T employee){
            employee.work();
    }
    
    public static <T extends Employee> void calculateSalary(T employee){
        System.out.println(employee.getName() + " earns " + employee.calculateSalary() + " dollars per day");
    }
}
