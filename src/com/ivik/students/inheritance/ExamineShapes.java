package com.ivik.students.inheritance;

/**
 * Created by Christian on 19-1-2016.
 */
public class ExamineShapes {

      public static void shapes() {

                Shape shape1 = new Circle(5.7);
                Shape shape2 = new Triangle(5.8, 7.2, 6.7);
                Shape shape3 = new Square(7.5);
                Shape shape4 = new Rectangle(9.15, 8.75);

                System.out.println("Circle area: " + shape1.getArea() + " Circle perimeter: " + shape1.getPerimeter());
                System.out.println("Triangle area: " + shape2.getArea() + " Triangle perimeter: " + shape2.getPerimeter());
                System.out.println("Square area: " + shape3.getArea() + " Square perimeter: " + shape3.getPerimeter());
                System.out.println("Rectangle area: " + shape4.getArea() + " Rectangle perimeter " + shape4.getPerimeter());


//          System.out.format("Area of circle with radius  %6.2f is %6.2f" ,radius ,ShapeDetail.shapeArea(new Circle(radius)));
//         System.out.format("Perimeter of circle with radius  %6.2f is %6.2f" ,radius ,ShapeDetail.shapePerimeter(new Circle(radius)));
            }

    public static void main(String[] args) {

        new ExamineShapes().shapes();
    }
}


/*
* Je methode naam is niet goed , het is in hoofd letters en is ook de naam van een class.
* Gebruik ShapeDetail zoals dit ...
​_System.out.format("Area of circle with radius  %6.2f is %6.2f" ,radius ,ShapeDetail.shapeArea(new Circle(radius)));_​
*
*
* */