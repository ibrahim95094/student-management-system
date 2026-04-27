import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sm.addStudent();
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    sm.searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}