package chap7;

public class Circle extends Shape {
    private int radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
