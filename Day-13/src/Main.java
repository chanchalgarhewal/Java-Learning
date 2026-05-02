import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units;
        float bill = 0;

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        if (units <= 100) {
            bill = units * 0.5f;
        }
        else if (units <= 200) {
            bill = (100 * 0.5f) + ((units - 100) * 1.45f);
        }
        else {
            bill = (100 * 0.5f) + (100 * 1.45f) + ((units - 200) * 4.85f);
        }

        if (bill > 1000) {
            bill = bill + 100;
        }

        System.out.printf("Total Bill = %.2f%n", bill);
        sc.close();
    }
}