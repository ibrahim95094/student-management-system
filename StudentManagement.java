import java.util.Scanner;

class StudentManagement {
    int id[] = new int[5];
    String name[] = new String[5];
    int count = 0;

    Scanner sc = new Scanner(System.in);

    // Add Student
    void addStudent() {
        System.out.print("Enter Student ID: ");
        id[count] = sc.nextInt();

        System.out.print("Enter Student Name: ");
        name[count] = sc.next();

        count++;
        System.out.println("Student added successfully");
    }

    // Display Students
    void displayStudents() {
        System.out.println("Student List:");
        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + id[i] + " Name: " + name[i]);
        }
    }

    // Search Student
    void searchStudent() {
        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (id[i] == searchId) {
                System.out.println("Student Found: " + name[i]);
                return;
            }
        }
        System.out.println("Student not found");
    }
}