import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class BigRectLister
{
    public static void main(String[] args)
    {
        List<Rectangle> rectangles = new ArrayList<>();
        BigRectangleFilter filter = new BigRectangleFilter();

        rectangles.add(new Rectangle(2, 3)); //Should not display, Perimeter is 10
        rectangles.add(new Rectangle(4, 5)); //Should Display, Perimeter is 18
        rectangles.add(new Rectangle(1, 2)); //Should not display, Perimeter is 6
        rectangles.add(new Rectangle(1, 1)); //Should not display, Perimeter is 4
        rectangles.add(new Rectangle(8, 9)); //Should display, perimeter is 34
        rectangles.add(new Rectangle(9, 10)); //Should display, perimeter is 38
        rectangles.add(new Rectangle(8, 7)); //Should display, perimeter is 30
        rectangles.add(new Rectangle(1, 3)); //Should not display, perimeter is 8
        rectangles.add(new Rectangle(1, 7)); //Should Display, perimeter is 16
        rectangles.add(new Rectangle(1, 5)); //Should display, perimeter is 12;

        System.out.println("Rectangles with a > 10 perimeter:");
        for (Rectangle rectangle : rectangles){
            if(filter.accept(rectangle)){
                System.out.println("Rectangle " + rectangle + " Perimeter: "
                        + (2 * (rectangle.width + rectangle.height)));
            }
        }
    }
}
