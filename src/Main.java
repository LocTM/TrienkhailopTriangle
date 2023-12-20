import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();

        System.out.print("Enter the color of the triangle: ");
        String color = scanner.next();


        Triangle triangle = new Triangle(color, side1, side2, side3);


        System.out.println("Triangle information:");
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Side 1: " + triangle.getSide1());
        System.out.println("Side 2: " + triangle.getSide2());
        System.out.println("Side 3: " + triangle.getSide3());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
    }