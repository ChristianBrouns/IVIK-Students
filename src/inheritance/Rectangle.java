package inheritance;

/**
 * Created by Christian on 16-1-2016.
 */
public class Rectangle extends Shape {

    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        area = width * height;

        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * width + 2 * height;

        return perimeter;
    }
}
