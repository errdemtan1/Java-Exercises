package com.erdem.innerclass;

public class InnerClass {
    public static void main(String[] args) {

        //If triangle class is static
        //Shape.Triangle triangle = new Shape.Triangle(6, 8, 10);

        // If triangle class isn't static
        Shape.Triangle triangle = new Shape().new Triangle(6, 8, 10);
        System.out.println("Area of triangle = " + triangle.calculateArea());
        System.out.println("Perimeter of triangle = " + triangle.calculatePerimeter());
        
        Shape.Square square = new Shape().new Square(5,10);
        System.out.println("Area of square = " + square.calculateArea());
        System.out.println("Perimeter of square = " + square.calculatePerimeter());
        
        Shape.Circle circle = new Shape().new Circle(5);
        System.out.println("Area of circle = " + circle.calculateArea());
        System.out.println("Perimeter of square = " + circle.calculatePerimeter());
    }
    
}
