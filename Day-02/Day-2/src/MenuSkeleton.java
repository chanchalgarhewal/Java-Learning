import java.util.Scanner;

public class MenuSkeleton {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.Add 2.Sub 3.Exit");
            System.out.println("enter choice:");
            int ch= sc.nextInt();
            switch(ch){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Bye!");
                    return;
                default:

            }
        }
    }
}