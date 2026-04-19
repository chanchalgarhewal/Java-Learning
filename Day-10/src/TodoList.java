import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n__ TO-DO LISt MENU__");
            System.out.println("1.Add task");
            System.out.println("2.View Task");
            System.out.println("3.Delete Task");
            System.out.println("4.Exit");
            System.out.println("Enter choice:");

            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("Enter task:");
                    String task = sc.nextLine();
                    tasks.add(task);

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + "." + tasks.get(i));
                        }
                    }
                case 3:
                    int index = sc.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.remove(index - 1);
                    }
                case 4:
                    return;

                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}