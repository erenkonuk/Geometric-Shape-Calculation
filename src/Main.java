public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5.0);
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        Triangle triangle = new Triangle(6.0, 8.0, 10.0);
        double triangleArea = triangle.calculateArea();
        double trianglePerimeter = triangle.calculatePerimeter();

        Square square = new Square(4.0);
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);

        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);
    }
}