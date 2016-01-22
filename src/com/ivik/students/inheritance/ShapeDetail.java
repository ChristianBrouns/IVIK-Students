package com.ivik.students.inheritance;

/**
 * Created by Christian on 19-1-2016.
 */
public class ShapeDetail {


    public static double shapeArea(Shape shape) {
        shape.getArea();

        return shape.area;
    }


    public static double shapePerimeter(Shape shape) {

        shape.getPerimeter();

        return shape.perimeter;
    }
}

