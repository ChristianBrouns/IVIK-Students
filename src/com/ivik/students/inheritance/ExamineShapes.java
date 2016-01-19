package com.ivik.students.inheritance;

/**
 * Created by Christian on 19-1-2016.
 */
public class ExamineShapes {

      public void ShapeDetail() {

                Shape shape1 = new Circle(5.7);
                Shape shape2 = new Triangle(5.8, 7.2, 6.7);
                Shape shape3 = new Square(7.5);
                Shape shape4 = new Rectangle(9.15, 8.75);

                System.out.println("Circle area: " + shape1.getArea() + " Circle perimeter: " + shape1.getPerimeter());
                System.out.println("Triangle area: " + shape2.getArea() + " Triangle perimeter: " + shape2.getPerimeter());
                System.out.println("Square area: " + shape3.getArea() + " Square perimeter: " + shape3.getPerimeter());
                System.out.println("Rectangle area: " + shape4.getArea() + " Rectangle perimeter " + shape4.getPerimeter());
            }

    public static void main(String[] args) {

        new ExamineShapes().ShapeDetail();
    }
}