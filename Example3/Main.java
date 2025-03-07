interface Shape {
    double CalculateArea(); //Abstract Method
    default void printShapeDetails() {
        System.out.println("Shape Details: Area = " + CalculateArea()); //Default Method
    }
    static double CalculatePerimeter(double side1, double side2) {
        return 2 * (side1 + side2); //Static Method
    }
}
class Square implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double CalculateArea() {
        return side * side;
    }
}
public class Main {
   public static void main(String[] args) {
    Square square = new Square(5);
    square.printShapeDetails(); //Uses the default implementation
    double perimeter = Shape.CalculatePerimeter(5,5); //calls the static method
    System.out.println("Perimeter: " + perimeter);
   }
    
}
