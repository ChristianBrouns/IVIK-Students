package com.ivik.students.inheritance;

/**
 * Created by Christian on 16-1-2016.
 */
public class Rectangle extends Shape {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        area = width * height;

        return this.area;
    }

    public double getPerimeter() {
        perimeter = 2 * width + 2 * height;

        return this.perimeter;
    }
}
