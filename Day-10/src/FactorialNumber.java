import java.util.Scanner;
public class factorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count, n, fact = 1;
        System.out.println("Enter any number:");
        n = sc.nextInt();
        for (count = 1; count <= n; count++) {
            fact = fact * count;
        }
        System.out.println("Factorial is:" + fact);
    }
}
