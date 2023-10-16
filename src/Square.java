public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return Math.pow(sideLength, 2);
    }

    public double calculatePerimeter() {
        return 4 * sideLength;
    }
}
