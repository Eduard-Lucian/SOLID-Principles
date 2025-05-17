import shape.Circle;
import shape.Square;
import shape.Rectangle;
import shape.Shape;
import area.AreaCalculator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(3);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(5, 2);

        List<Shape> shapes = Arrays.asList(circle, square, rectangle);

        AreaCalculator calculator = new AreaCalculator();

        double total = calculator.totalArea(shapes);

        System.out.println("Aria totală a formelor este: " + total);
    }
}
