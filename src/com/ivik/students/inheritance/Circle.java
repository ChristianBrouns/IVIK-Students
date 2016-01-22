package com.ivik.students.inheritance;

/**
 * Created by Christian on 18-1-2016.
 */
public class Circle extends Shape {

    double radius;


    public Circle (double radius){
        this.radius = radius;
    }

     public double getArea() {
        area = radius * radius * Math.PI;

        return this.area;
    }

    public double getPerimeter() {
        perimeter = 2 * radius * Math.PI;

        return this.perimeter;
    }

}