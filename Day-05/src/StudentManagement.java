import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private double marks;
    private String grade;
    private boolean isPass;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.grade = calculateGrade(marks);
        this.isPass = marks >= 40.0;
    }

    private String calculateGrade(double marks) {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }
    public double getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setMarks(double marks) {
        this.marks = marks;
        this.grade = calculateGrade(marks);
        this.isPass = marks >= 40.0;
    }

    public void display() {
        System.out.println("  Roll No : " + rollNo);
        System.out.println("  Name    : " + name);
        System.out.println("  Marks   : " + marks);
        System.out.println("  Grade   : " + grade);
        System.out.println("  Result  : " + (isPass ? "Pass" : "Fail"));
    }
}

public class StudentManagement {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // Check if roll number already exists
    static boolean rollExists(int roll) {
        for (Student s : students) {
            if (s.getRollNo() == roll) return true;
        }
        return false;
    }

    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        if (rollExists(roll)) {
            System.out.println("  [Error] Roll No already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("  [Error] Name cannot be empty!");
            return;
        }

        System.out.print("Enter Marks (0 - 100): ");
        double marks = sc.nextDouble();

        if (marks < 0 || marks > 100) {
            System.out.println("  [Error] Marks must be between 0 and 100!");
            return;
        }

        students.add(new Student(roll, name, marks));
        System.out.println("  Student added successfully!");
    }
    static void displayAll() {
        if (students.isEmpty()) {
            System.out.println("  No students found.");
            return;
        }
        System.out.println("\n");
        for (Student s : students) {
            s.display();
        }
    }

    static void searchByRoll() {
        System.out.print("Enter Roll No to search: ");
        int roll = sc.nextInt();

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                System.out.println("\n  Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("  [Error] Student not found!");
    }

    // Update student details
    static void updateStudent() {
        System.out.print("Enter Roll No to update: ");
        int roll = sc.nextInt();
        sc.nextLine();

        for (Student s : students) {
            if (s.getRollNo() == roll) {
                System.out.print("Enter New Name (press Enter to skip): ");
                String name = sc.nextLine().trim();
                if (!name.isEmpty()) {
                    s.setName(name);
                }

                System.out.print("Enter New Marks (-1 to skip): ");
                double marks = sc.nextDouble();
                if (marks != -1) {
                    if (marks < 0 || marks > 100) {
                        System.out.println("  [Error] Invalid marks! Update cancelled.");
                        return;
                    }
                    s.setMarks(marks);
                }

                System.out.println("  Student updated successfully!");
                s.display();
                return;
            }
        }
        System.out.println("  [Error] Student not found!");
    }

    static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int roll = sc.nextInt();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollNo() == roll) {
                System.out.println("  Deleted: " + students.get(i).getName());
                students.remove(i);
                return;
            }
        }
        System.out.println("  [Error] Student not found!");
    }

    static void showSummary() {
        if (students.isEmpty()) {
            System.out.println("  No students found.");
            return;
        }

        int pass = 0, fail = 0;
        double total = 0;
        double highest = students.get(0).getMarks();
        double lowest = students.get(0).getMarks();

        for (Student s : students) {
            total += s.getMarks();
            if (s.getMarks() >= 40) pass++;
            else fail++;
            if (s.getMarks() > highest) highest = s.getMarks();
            if (s.getMarks() < lowest) lowest = s.getMarks();
        }

        System.out.println("\n");
        System.out.println("  Total Students : " + students.size());
        System.out.println("  Passed         : " + pass);
        System.out.println("  Failed         : " + fail);
        System.out.printf ("  Average Marks  : %.2f%n", total / students.size());
        System.out.println("  Highest Marks  : " + highest);
        System.out.println("  Lowest Marks   : " + lowest);
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n");
            System.out.println("  1. Add Student");
            System.out.println("  2. Display All Students");
            System.out.println("  3. Search by Roll No");
            System.out.println("  4. Update Student");
            System.out.println("  5. Delete Student");
            System.out.println("  6. Show Summary");
            System.out.println("  7. Exit");

            System.out.print("  Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent();    break;
                case 2: displayAll();    break;
                case 3: searchByRoll();  break;
                case 4: updateStudent(); break;
                case 5: deleteStudent(); break;
                case 6: showSummary();   break;
                case 7: System.out.println("  Goodbye!"); break;
                default: System.out.println("  [Error] Invalid choice! Enter 1-7.");
            }

        } while (choice != 7);

        sc.close();
    }
}

