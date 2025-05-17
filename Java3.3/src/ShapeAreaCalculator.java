import java.util.List;

public class ShapeAreaCalculator {
    public static double sumAreas(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
