
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(101, "Harshit", 85);
        Student student2 = new Student(102, "Aman", 72);
        Student student3 = new Student(103, "Rahul", 91);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {


            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("Enter student ID: ");
                int id = sc.nextInt();

                System.out.print("Enter student name: ");
                String name = sc.next();

                System.out.println("Enter marks:");
                int marks = sc.nextInt();

                Student student = new Student(id, name, marks);
                students.add(student);

                System.out.println("Student added successfully!");

            } else if (choice == 2) {

                for (Student student : students) {
                    System.out.println(
                            "ID: " + student.id +
                                    ", Name: " + student.name +
                                    ", Marks: " + student.marks
                    );
                }

            } else if (choice == 3) {

                System.out.print("Enter student ID to search: ");
                int searchId = sc.nextInt();

                boolean found = false;

                for (Student student : students) {
                    if (student.id == searchId) {
                        System.out.println(
                                "ID: " + student.id +
                                        ", Name: " + student.name +
                                        ", Marks: " + student.marks
                        );
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found");
                }
            } else if (choice == 4) {

                System.out.println("Enter student ID o update: ");
                int updateId = sc.nextInt();

                boolean found = false;

                for (Student student : students) {
                    if (student.id == updateId) {
                        System.out.println("Enter new marks: ");
                        int newMarks = sc.nextInt();

                        student.marks = newMarks;

                        System.out.println("Student updated successfully");

                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.");
                }
            }else if (choice == 5) {

                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean found = false;


                    for (int i = 0; i < students.size(); i++) {
                        if (students.get(i).id == deleteId) {
                            students.remove(i);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Student not found.");
                    }
                } else if (choice == 6) {

                    running = false;

                    System.out.println("Program closed");

                }


            }
            sc.close();
        }

    }
