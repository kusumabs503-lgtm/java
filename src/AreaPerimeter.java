 import java.util.Scanner;

    public class AreaPerimeter {

        // Square
        static void square(double side) {
            double area = side * side;
            double perimeter = 4 * side;

            System.out.println("Square Area = " + area);
            System.out.println("Square Perimeter = " + perimeter);
        }

        // Rectangle
        static void rectangle(double length, double breadth) {
            double area = length * breadth;
            double perimeter = 2 * (length + breadth);

            System.out.println("Rectangle Area = " + area);
            System.out.println("Rectangle Perimeter = " + perimeter);
        }

        // Triangle
        static void triangle(double base, double height,
                             double side1, double side2, double side3) {
            double area = 0.5 * base * height;
            double perimeter = side1 + side2 + side3;

            System.out.println("Triangle Area = " + area);
            System.out.println("Triangle Perimeter = " + perimeter);
        }

        // Circle
        static void circle(double radius) {
            double area = Math.PI * radius * radius;
            double perimeter = 2 * Math.PI * radius;

            System.out.println("Circle Area = " + area);
            System.out.println("Circle Perimeter = " + perimeter);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter side of square: ");
            double side = sc.nextDouble();
            square(side);

            System.out.print("\nEnter length of rectangle: ");
            double length = sc.nextDouble();

            System.out.print("Enter breadth of rectangle: ");
            double breadth = sc.nextDouble();
            rectangle(length, breadth);

            System.out.print("\nEnter base of triangle: ");
            double base = sc.nextDouble();

            System.out.print("Enter height of triangle: ");
            double height = sc.nextDouble();

            System.out.print("Enter side 1 of triangle: ");
            double side1 = sc.nextDouble();

            System.out.print("Enter side 2 of triangle: ");
            double side2 = sc.nextDouble();

            System.out.print("Enter side 3 of triangle: ");
            double side3 = sc.nextDouble();

            triangle(base, height, side1, side2, side3);

            System.out.print("\nEnter radius of circle: ");
            double radius = sc.nextDouble();
            circle(radius);

            sc.close();
        }
    }

