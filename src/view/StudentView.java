package view;

import controller.StudentController;
import exceptions.ExistedStudentException;
import exceptions.InvalidAgeException;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    private final Scanner sc = new Scanner(System.in);
    private final StudentController studentController = new StudentController();

    public void displayMenu() {
        do {
            System.out.println("MENU");
            System.out.println("1. Display students");
            System.out.println("2. Add student");
            System.out.println("3. Delete student");
            System.out.println("4. Edit student");
            System.out.println("5. Exit");

            System.out.println("Enter your option");
            int option;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                continue;
            }

            switch (option) {
                case 1:
                    List<Student> students = this.studentController.getStudents();
                    if (students == null) break;
                    for (Student st : students) {
                        System.out.println(st);
                    }
                    break;
                case 2:
                    System.out.println("Input ID");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Input name");
                    String name = sc.nextLine();

                    int age = 0;
                    boolean isValidAge;
                    do {
                        try {
                            age = this.inputAge();
                            isValidAge = true;
                        } catch (InvalidAgeException e) {
                            e.printStackTrace();
                            isValidAge = false;
                        }
                    } while (!isValidAge);

                    Student student = new Student(id, name, age);
                    try {
                        this.studentController.addStudent(student);
                    } catch (ExistedStudentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Input ID");
                    int deleteStudentId = Integer.parseInt(sc.nextLine());
                    this.studentController.deleteStudent(deleteStudentId);
                    break;
                case 4:
                    System.out.println("Input ID");
                    int updatedId = Integer.parseInt(sc.nextLine());

                    System.out.println("Input new name");
                    String newName = sc.nextLine();

                    int newAge = 0;
                    boolean isValidNewAge;
                    do {
                        try {
                            newAge = this.inputAge();
                            isValidNewAge = true;
                        } catch (InvalidAgeException e) {
                            e.printStackTrace();
                            isValidNewAge = false;
                        }
                    } while (!isValidNewAge);

                    Student updatedStudent = new Student(updatedId, newName, newAge);
                    this.studentController.editStudent(updatedStudent);
                    break;
                case 5:
                    System.exit(1);
                default:
                    System.out.println("Invalid option");
            }

        } while (true);
    }

    private int inputAge() throws InvalidAgeException {
        System.out.println("Input age");
        int age = Integer.parseInt(sc.nextLine());
        if (age <= 0) {
            throw new InvalidAgeException();
        }
        return age;
    }

}
