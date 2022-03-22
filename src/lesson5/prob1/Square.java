package lesson5.prob1;

public class Square extends Rectangle{
    public Square(String color, double width, double height) {
        super(color, width, height);
    }

    @Override
    protected double calculateArea() {
        return super.width * super.height;
    }

    @Override
    protected double calculatePerimeter() {
        return 4 * width;
    }
}
