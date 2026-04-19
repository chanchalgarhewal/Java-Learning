import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        double a = sc.nextDouble();

        System.out.println("Enter second number:");
        double b = sc.nextDouble();

        System.out.println("choose operation:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Average");
        System.out.println("6.Percentage");
        System.out.println("7.Modulus");

        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Result=" + (a + b));

        } else if (choice == 2) {
            System.out.println("Result=" + (a - b));

        } else if (choice == 3) {
            System.out.println("Result=" + (a * b));

        } else if (choice == 4) {
            if (b != 0) {
                System.out.println("Result=" + (a / b));
            } else {
                System.out.println(" cannot divide by zero");
            }

        } else if (choice == 5) {
            System.out.println("Average=" + ((a + b) / 2));

        } else if (choice == 6) {
            System.out.println("percentage=" + ((a / b) * 100));

        } else if (choice == 7) {
            System.out.println("Modulus=" + (a % b));
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();


    }
}
