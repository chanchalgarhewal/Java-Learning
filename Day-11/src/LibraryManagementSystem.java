import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    boolean isIssued;

    Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.isIssued = false;
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\n___LIBRARY MENU__");
            System.out.println("1.Add Book");
            System.out.println("2.View Books");
            System.out.println("3.Issue Book");
            System.out.println("4.Return Book");
            System.out.println("5.Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    books.add(new Book(id, name));
                    System.out.println("Book added!");
                    break;

                case 2:
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println(b.id + " " + b.name +
                                    (b.isIssued ? " (Issued)" : " (Available)"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to issue: ");
                    int issueId = sc.nextInt();

                    for (Book b : books) {
                        if (b.id == issueId && !b.isIssued) {
                            b.isIssued = true;
                            System.out.println("Issued!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to return: ");
                    int returnId = sc.nextInt();

                    for (Book b : books) {
                        if (b.id == returnId && b.isIssued) {
                            b.isIssued = false;
                            System.out.println("Returned!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}