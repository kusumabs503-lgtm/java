import java.util.Scanner;

public class ShapeCalculator {

    static void square(int s) {
        System.out.println("Area = " + (s * s));
        System.out.println("Perimeter = " + (4 * s));
    }

    static void rectangle(int l, int b) {
        System.out.println("Area = " + (l * b));
        System.out.println("Perimeter = " + (2 * (l + b)));
    }

    static void triangle(int b, int h, int a, int c, int d) {
        System.out.println("Area = " + (0.5 * b * h));
        System.out.println("Perimeter = " + (a + c + d));
    }

    static void circle(double r) {
        System.out.println("Area = " + (3.14 * r * r));
        System.out.println("Perimeter = " + (2 * 3.14 * r));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter square side: ");
        square(sc.nextInt());

        System.out.print("Enter rectangle length: ");
        int l = sc.nextInt();

        System.out.print("Enter rectangle breadth: ");
        int b = sc.nextInt();
        rectangle(l, b);

        System.out.print("Enter triangle base: ");
        int base = sc.nextInt();

        System.out.print("Enter triangle height: ");
        int height = sc.nextInt();

        System.out.print("Enter 3 sides: ");
        int a = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        triangle(base, height, a, c, d);

        System.out.print("Enter circle radius: ");
        circle(sc.nextDouble());

        sc.close();
    }
}
