import java.util.Scanner;
public class PositiveNegetiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }
    }
}
