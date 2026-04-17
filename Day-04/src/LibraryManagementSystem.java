import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    static class Book {
        int id;
        String name;
        boolean isIssued;

        Book(int id, String name) {
            this.id = id;
            this.name = name;
            this.isIssued = false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n Library Menu ");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Name: ");
                    String name = sc.nextLine();
                    books.add(new Book(id, name));
                    System.out.println("Book Added Successfully!");
                    break;

                case 2:
                    System.out.println("\n Book List");
                    for (Book b : books) {
                        System.out.println("ID: " + b.id +
                                " | Name: " + b.name +
                                " | Issued: " + b.isIssued);
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    for (Book b : books) {
                        if (b.id == issueId && !b.isIssued) {
                            b.isIssued = true;
                            System.out.println("Book Issued!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    for (Book b : books) {
                        if (b.id == returnId && b.isIssued) {
                            b.isIssued = false;
                            System.out.println("Book Returned!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}