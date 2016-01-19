package com.ivik.students.inheritance;

/**
 * Created by Christian on 18-1-2016.
 */
public class Triangle extends Shape {
        double side1;
        double side2;
        double side3;

        public Triangle (double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
    }

            public double getArea () {
                double p = (side1 + side2 + side3) / 2;
                area = Math.sqrt (p * (p - side1) * (p - side2) * (p - side3));

            return this.area;
    }

        public void setArea (double area) {
            this.area = area;
        }

        public double getPerimeter (){
            perimeter = side1 + side2 + side3;

            return this.perimeter;
    }
        public void setPerimeter (double perimeter) {
            this.perimeter = perimeter;
        }

}
