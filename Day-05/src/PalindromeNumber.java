import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n, r,s = 0;
        System.out.println("Enter any number");
        n= sc. nextInt();
        int c = n;
        while(n>0)
        {
            r=n%10;
            s=r+(s*10);
            n=n/10;
        }
        if (c==s) {
            System.out.println("Palindrome no");
        }
        else {
            System.out.println("Not palindrom no");
        }


    }
}
