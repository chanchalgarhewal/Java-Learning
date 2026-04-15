import java.util.Scanner;
public class PositiveNegetiveNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();

        if(a>=0) {
            System.out.println(" Positive number:");
        }
        else{
            System.out.println("Negetive Number:");

        }

    }
}

