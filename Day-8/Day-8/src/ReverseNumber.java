import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, r, s = 0;
        System.out.println("Enter any number");
        n = sc.nextInt();

        while(n > 0) {
            r = n % 10;
            s = r + (s * 10);
            n = n / 10;
        }

        System.out.println("Reverse number: " + s);
    }
}

