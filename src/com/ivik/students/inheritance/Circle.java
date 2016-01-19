package com.ivik.students.inheritance;

/**
 * Created by Christian on 18-1-2016.
 */
public class Circle extends Shape {

   double radius;

    public Circle (double radius) {
        this.radius = radius;

    }
            public double getArea () {
                area = this.radius * this.radius * Math.PI;

            return this.area;
            }

             public void setArea (double area) {
                this.area = area;
    }

            public double getPerimeter () {
                perimeter =  2 * this.radius * Math.PI;

                return this.perimeter;
            }

            public void setPerimeter (double perimeter) {
                this.perimeter = perimeter;
            }

}
