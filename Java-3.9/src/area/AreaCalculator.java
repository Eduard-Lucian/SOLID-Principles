package area;

import shape.Shape;

import java.util.List;

public class AreaCalculator {

    // Respectă Single Responsibility — se ocupă doar de calculul ariilor

    public double totalArea(List<Shape> shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.getArea();
        }
        return total;
    }
}
