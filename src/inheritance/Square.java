package inheritance;

/**
 * Created by Christian on 18-1-2016.
 */
public class Square extends Rectangle {

    public Square(double width) {
        super(width, width);
        this.width = width;

    }

        public double getArea () {
            area = width * width;

            return area;
        }

       public double getPerimeter (){
            perimeter = 4 * width;

            return perimeter;
    }
}
