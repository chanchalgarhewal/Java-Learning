import java.util.Scanner;
public class Scholarship{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int percentage;
        System.out.println("Enter percentage:");
        percentage=sc.nextInt();

        if (percentage >=90){
            System.out.println("Full Scholarship");
        }
        else if(percentage >= 75){
            System.out.println("Half Scholarship");
        }
        else if(percentage >=60){
            System.out.println("Quarter Scholarship");
        }
        else{
            System.out.println("No Scholarship");
        }
        sc.close();

    }
}