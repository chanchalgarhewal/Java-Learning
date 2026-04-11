import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n, arm = 0, r;
        System.out.println("Enter any number:");

        n = sc.nextInt();
        int c = n;

        while(n > 0) {
            r = n % 10;
            arm = arm + (r * r * r);
            n = n / 10;
        }

        if(c == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}