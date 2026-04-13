package src;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int total = 0;
            int marks;

            System.out.println("Enter marks of 5 subjects:");
            for(int i = 1; i <= 5; i++) {
                System.out.print("Subject " + i + " marks: ");
                marks = sc.nextInt();
                total += marks;
            }
            double percentage = total / 5.0;
            System.out.println("\nTotal Marks = " + total);
            System.out.println("Percentage = " + percentage);
        {
            if(percentage >= 90) {
                System.out.println("Grade: A");
            }
            else if(percentage >= 75) {
                System.out.println("Grade: B");
            }
            else if(percentage >= 50) {
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Fail");
            }

            sc.close();
        }
    }
}
