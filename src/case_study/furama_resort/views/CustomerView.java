package case_study.furama_resort.views;

import case_study.furama_resort.common.Regex;
import case_study.furama_resort.common.UserException;
import case_study.furama_resort.controllers.CustomerController;
import case_study.furama_resort.models.person.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static final Scanner scanner = new Scanner(System.in);
    private final CustomerController customerController = new CustomerController();

    public void displayCustomerManagement() throws UserException {
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
        List<Customer> customerList = this.customerController.getListCustomer();

        if(customerList.isEmpty()){
            System.out.println("List customer is empty.");
            return;
        }

        System.out.println("-----------LIST CUSTOMER------------");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    private void addToListCustomer() throws  UserException {
        do {
            try {
                System.out.println("Enter the ID you wish to add: ");
                int id = Integer.parseInt(scanner.nextLine());
                while (id<=0){
                    System.out.println("ID always greater than 0. Enter id again: ");
                    id = Integer.parseInt(scanner.nextLine());
                }
                boolean isIDCustomerAlreadyExists = this.customerController.isIDCustomerAlreadyExists(id);

                if (isIDCustomerAlreadyExists) {
                    System.out.print("The ID you want to add already exists. ");
                } else {
                    Customer newCustomer = newCustomer(id);
                    this.customerController.addToListCustomer(newCustomer);
                    System.out.println("Successful add.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    private void editListCustomer() throws UserException {
        if (this.customerController.getListCustomer().isEmpty()) {
            System.out.println("List customer is empty. You can't edit.");
            return;
        }
        do {
            try {
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
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    private Customer newCustomer(int id) {
        System.out.println("Enter name: ");
        String newName = scanner.nextLine();
        String newDayOfBirth = inputOld();
        System.out.println("Enter gender: ");
        String newGender = scanner.nextLine();
        System.out.println("Enter number card: ");
        String newNumberCard = scanner.nextLine();
        System.out.println("Enter email: ");
        String newEmail = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String newPhoneNumber = scanner.nextLine();
        String newType = customerType();
        System.out.println("Enter address: ");
        String newAddress = scanner.nextLine();

        return new Customer(id, newName, newDayOfBirth, newGender,
                newNumberCard, newEmail, newPhoneNumber, newType, newAddress);
    }

    private String customerType() {
        System.out.println("CUSTOMER TYPE: \n" +
                "1. Diamond\n" +
                "2. Platinum\n" +
                "3. Gold\n" +
                "4. Silver\n" +
                "5. Member\n" +
                "Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice < 1 || choice > 5) {
            System.out.println("Choice not true. Enter again choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        }
        switch (choice) {
            case 1:
                return "Diamond";
            case 2:
                return "Platinum";
            case 3:
                return "Gold";
            case 4:
                return "Silver";
            case 5:
                return "Member";
        }
        return "";
    }

    private String inputOld() {
        String newDayOfBirth;
        boolean flag;
        do {
            System.out.println("Enter Enter day of birth (dd/mm/yyyy): ");
            newDayOfBirth = scanner.nextLine();
            flag = isCheckOldEnough(newDayOfBirth);
        } while (!flag);
        return newDayOfBirth;
    }

    private boolean isCheckOldEnough(String dayOfBirth){
        if (Regex.checkDateFormat(dayOfBirth)) {
//              localDayOfBirth = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            LocalDate localDayOfBirth = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate currentDay = LocalDate.now();
            int old = Period.between(localDayOfBirth, currentDay).getYears();
            try {
                checkOldException(old);
                return true;
            }catch (UserException e){
                System.err.println(e.getMessage());
            }
        }
        System.out.println("Invalid data");
        return false;
    }

    private void checkOldException(int old) throws UserException {
        if (old < 18) {
            throw new UserException("You're under 18 years old.");
        } else if (old > 100) {
            throw new UserException("You're over the age of 100.");
        } else {
            System.out.println("You are old enough.");
        }
    }

}
