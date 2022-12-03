package case_study.furama_resort.view;

import case_study.furama_resort.common.Common;
import case_study.furama_resort.controllers.CustomerController;
import case_study.furama_resort.models.person.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();
    private final Common common = new Common();
    public void displayCustomerManagement() {
        do {
            menuCustomerManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayListCustomer();
                    break;
                case 2:
                    addToListCustomer();
                    break;
                case 3:
                    editListCustomer();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void menuCustomerManagement() {
        System.out.println("Customer Management: \n" +
                "1.\tDisplay list customers \n" +
                "2.\tAdd new customer \n" +
                "3.\tEdit customer \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }
    private void displayListCustomer() {
        System.out.println(this.customerController.displayListCustomer());
    }

    private void addToListCustomer() {
        do {
            System.out.println("Enter the ID you wish to add: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isIDCustomerAlreadyExists = this.customerController.isIDCustomerAlreadyExists(id);

            if (isIDCustomerAlreadyExists) {
                System.out.print("Id already exists. ");
            } else {
                Customer newCustomer = newCustomer(id);
                this.customerController.addToListCustomer(newCustomer);
                System.out.println("Successful add.");
                break;
            }

        } while (true);
    }

    private void editListCustomer() {
        do {
            System.out.println("Enter the ID you wish to edit: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean isIDCustomerAlreadyExists = this.customerController.isIDCustomerAlreadyExists(id);

            if (!isIDCustomerAlreadyExists) {
                System.out.print("The ID you want to edit does not already exist. ");
            } else {
                Customer editCustomer = newCustomer(id);
                this.customerController.editListCustomer(editCustomer);
                System.out.println("Successful edit.");
                break;
            }
        } while (true);
    }


    private Customer newCustomer(int id) {
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
        System.out.println("Enter type: ");
        String newType  = scanner.nextLine();
        System.out.println("Enter address: ");
        String newAddress = scanner.nextLine();

        return new Customer(id, newName, newDayOfBirth, newGender,
                newNumberCard, newEmail, newPhoneNumber,newType,newAddress);
    }

    private boolean checkAge(String dayOfBirth) {
        if (dayOfBirth.matches(common.DAY_OF_BIRTH)) {
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
