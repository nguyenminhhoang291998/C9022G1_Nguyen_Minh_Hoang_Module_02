package case_study.furama_resort.views;

import case_study.furama_resort.common.Common;
import case_study.furama_resort.controllers.EmployeeController;
import case_study.furama_resort.models.person.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();
    private final Common common = new Common();

    public void displayEmployeeManagement() {
        do {
            menuEmployeeManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayListEmployee();
                    break;
                case 2:
                    addToListEmployee();
                    break;
                case 3:
                    deleteInListEmployee();
                    break;
                case 4:
                    editListEmployee();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void displayListEmployee() {
        System.out.println(this.employeeController.displayListEmployee());
    }


    private void addToListEmployee() {
        do {
            System.out.println("Enter the ID you wish to add: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isIDEmployeeAlreadyExists = this.employeeController.isIDEmployeeAlreadyExists(id);

            if (isIDEmployeeAlreadyExists) {
                System.out.print("Id already exists. ");
            } else {
                Employee newEmployee = newEmployee(id);
                this.employeeController.addToListEmployee(newEmployee);
                System.out.println("Successful add.");
                break;
            }

        } while (true);
    }


    private void deleteInListEmployee() {
        do {
            System.out.println("Enter the ID you wish to delete: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isIDEmployeeAlreadyExists = this.employeeController.isIDEmployeeAlreadyExists(id);

            if (!isIDEmployeeAlreadyExists) {
                System.out.print("The ID you want to delete does not already exist. ");
            } else {
                this.employeeController.deleteInListEmployee(id);
                System.out.println("Successful delete.");
                break;
            }

        } while (true);
    }

    private void editListEmployee() {
        do {
            System.out.println("Enter the ID you wish to edit: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isIDEmployeeAlreadyExists = this.employeeController.isIDEmployeeAlreadyExists(id);

            if (!isIDEmployeeAlreadyExists) {
                System.out.print("The ID you want to edit does not already exist. ");
            } else {
                Employee editEmployee = newEmployee(id);
                this.employeeController.editListEmployee(editEmployee);
                System.out.println("Successful edit.");
                break;
            }
        } while (true);
    }

    private void menuEmployeeManagement() {
        System.out.println("Employee Management: \n" +
                "1.\tDisplay list employees \n" +
                "2.\tAdd new employee \n" +
                "3.\tDelete employee \n" +
                "4.\tEdit employee \n" +
                "5.\tReturn main menu \n" +
                "Enter choice: ");
    }

    private Employee newEmployee(int id) {
        System.out.println("Enter name: ");
        String newName = scanner.nextLine();
        //kiểm tra đủ tuổi
        String newDayOfBirth;
        boolean flag;
        do {
            System.out.println("Enter Enter day of birth (dd/mm/yyyy): ");
            newDayOfBirth = scanner.nextLine();
            flag = checkAge(newDayOfBirth);
        } while (!flag);

        System.out.println("Enter gender: ");
        String newGender = scanner.nextLine();
        System.out.println("Enter number card: ");
        String newNumberCard = scanner.nextLine();
        System.out.println("Enter email: ");
        String newEmail = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.println("Enter degree: ");
        String newDegree = scanner.nextLine();
        System.out.println("Enter position: ");
        String newPosition = scanner.nextLine();
        System.out.println("Enter salary: ");
        int newSalary = Integer.parseInt(scanner.nextLine());
        return new Employee(id, newName, newDayOfBirth, newGender,
                newNumberCard, newEmail, newPhoneNumber, newDegree, newPosition, newSalary);
    }

    private boolean checkAge(String dayOfBirth) {
        if (dayOfBirth.matches(common.DATE_REGEX)) {
            if (dayOfBirth.matches(common.DATE_FORMAT)) {
//              localDayOfBirth = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                LocalDate localDayOfBirth = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate currentDay = LocalDate.now();
                int age = Period.between(localDayOfBirth, currentDay).getYears();
                if (age < 18) {
                    System.out.println("You're under 18 years of age.");
                    return false;
                } else if (age > 100) {
                    System.out.println("You're over the age of 100.");
                    return false;
                } else {
                    System.out.println("You are old enough.");
                    return true;
                }
            }
            System.out.println("Invalid data.");
            return false;
        }
        System.out.println("Invalid data");
        return false;
    }

}




