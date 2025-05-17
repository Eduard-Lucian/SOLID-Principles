import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(3),
                new Rectangle(4, 5),
                new Triangle(6, 2)
        );

        double totalArea = ShapeAreaCalculator.sumAreas(shapes);
        System.out.println("Suma ariilor este: " + totalArea);
    }
}
