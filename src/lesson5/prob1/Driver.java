package lesson5.prob1;

public class Driver {
    public static void printTotal(Shape[] shapes) {
        double sumArea = 0;
        double sumPerimeter = 0;
        for (Shape shape : shapes
        ) {
            sumArea += shape.calculateArea();
            sumPerimeter += shape.calculatePerimeter();
        }
        System.out.printf("The shapes total area is %f and its perimeter is %f.",sumArea,sumPerimeter);
    }

    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Blue", 3, 4),
                new Rectangle("Green", 5, 6),
                new Square("Yellow", 7, 7),
                new Square("Yellow", 12, 12),
                new Circle("Brown", 8)
        };

        printTotal(shapes);
    }
}
