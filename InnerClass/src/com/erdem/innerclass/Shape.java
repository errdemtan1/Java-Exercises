package com.erdem.innerclass;

public class Shape {
    
    public class Triangle{
        private int firstEdge = 0;
        private int secondEdge = 0;
        private int thirdEdge = 0;

        public Triangle(int firstEdge, int secondEdge, int thirdEdge) {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
        
        public int calculatePerimeter(){   
            int perimeter = firstEdge + secondEdge + thirdEdge;
            return perimeter;
        }
        public double calculateArea(){
            int perimeter = firstEdge + secondEdge + thirdEdge;
            double area = Math.sqrt((perimeter/2)*(perimeter/2-firstEdge)*(perimeter/2-secondEdge)*(perimeter/2-thirdEdge));
            return area;
        }
    }
    
    public class Square{
        private int firstEdge = 0;
        private int secondEdge = 0;

        public Square(int firstEdge, int secondEdge) {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
        }
        
        public int calculatePerimeter(){   
            int perimeter = 2*firstEdge + 2*secondEdge;
            return perimeter;
        }
        public double calculateArea(){
            int area = firstEdge * secondEdge;
            return area;
        }
    }
    
    public class Circle{
        private int radius = 0;

        public Circle(int radius) {
            this.radius = radius;
        }
                
        public double calculatePerimeter(){   
            double perimeter = 2 * Math.PI * radius;
            return perimeter;
        }
        public double calculateArea(){
            double area = Math.PI * Math.pow(radius, 2);
            return area;
        }
    }
}
