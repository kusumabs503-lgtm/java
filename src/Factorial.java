public class Factorial {
    public static void main(String[] args) {
        int i = 1;
        long fact = 1;

        while (i <= 10) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " = " + fact);
            i++;
        }
    }
}
