import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        float amount, finalAmount;

        System.out.println("Enter amount:");
        amount = sc.nextFloat();

        if (amount >= 5000)
        {
            finalAmount = amount - (amount * 20 / 100);
        }
        else if (amount >= 2000)
        {
            finalAmount = amount - (amount * 10 / 100);
        }
        else if (amount >= 1000)
        {
            finalAmount = amount - (amount * 5 / 100);
        }
        else
        {
            finalAmount = amount;
        }

        System.out.printf("Final Amount = %.0f", finalAmount);
    }
}
