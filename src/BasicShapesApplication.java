import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Shape shape = circle;
        System.out.println("Shape: "+ shape.getName());

        Square square = new Square();
        Shape shape1 = square;
        System.out.println("Shape: "+ shape1.getName());

        Triangle triangle = new Triangle();
        Shape shape2 =triangle;
        System.out.println("Shape: "+ shape2.getName());

        List<Circle> circles = new ArrayList<>();
        System.out.println(circles);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        shapes.add(shape1);
        shapes.add(shape2);
        System.out.println(shapes.toString());
        for (Shape shapee : shapes) {
            System.out.println("Shape name: " + shapee);
        }
    }
}
