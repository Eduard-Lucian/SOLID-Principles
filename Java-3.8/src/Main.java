import shape.Circle;
import shape.Square;
import drawer.ShapeDrawer;

public class Main {
    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        Circle circle = new Circle();
        Square square = new Square();

        drawer.drawShape(circle);
        drawer.drawShape(square);
    }
}
