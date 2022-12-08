package case_study.furama_resort.views;

import case_study.furama_resort.common.NotFoundException;
import case_study.furama_resort.common.Regex;
import case_study.furama_resort.common.UserException;
import case_study.furama_resort.controllers.EmployeeController;
import case_study.furama_resort.models.person.Employee;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static final Scanner scanner = new Scanner(System.in);
    private final EmployeeController employeeController = new EmployeeController();

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
                    try {
                        deleteInListEmployee();
                    } catch (NotFoundException e) {
                        System.err.println(e.getMessage());
                    }
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

    private void menuEmployeeManagement() {
        System.out.println("Employee Management: \n" +
                "1.\tDisplay list employees \n" +
                "2.\tAdd new employee \n" +
                "3.\tDelete employee \n" +
                "4.\tEdit employee \n" +
                "5.\tReturn main menu \n" +
                "Enter choice: ");
    }

    private void displayListEmployee() {
        List<Employee> employeeList = this.employeeController.getListEmployee();
        if(employeeList.isEmpty()){
            System.out.println("List Employee is empty.");
            return;
        }

        System.out.println("-----------LIST EMPLOYEE------------");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }


    private void addToListEmployee() {
        do {
            try {
                System.out.println("Enter the ID you wish to add: ");
                int id = Integer.parseInt(scanner.nextLine());
                while (id<=0){
                    System.out.println("ID always greater than 0. Enter id again: ");
                    id = Integer.parseInt(scanner.nextLine());
                }
                boolean isIDEmployeeAlreadyExists = this.employeeController.isIDEmployeeAlreadyExists(id);

                if (isIDEmployeeAlreadyExists) {
                    System.out.print("Id already exists. ");
                } else {
                    Employee newEmployee = newEmployee(id);
                    this.employeeController.addToListEmployee(newEmployee);
                    System.out.println("Successful add.");
                    break;
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }


    private void deleteInListEmployee() throws NotFoundException {
        if (this.employeeController.getListEmployee().isEmpty()) {
            System.out.println("List employee is empty. You can't delete.");
            return;
        }

        System.out.println("Enter the ID you wish to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isIDEmployeeAlreadyExists = this.employeeController.isIDEmployeeAlreadyExists(id);

        if (!isIDEmployeeAlreadyExists) {
            throw new NotFoundException();
        } else {
            this.employeeController.deleteInListEmployee(id);
            System.out.println("Successful delete.");
        }

    }

    private void editListEmployee() {
        if (this.employeeController.getListEmployee().isEmpty()) {
            System.out.println("List employee is empty. You can't edit.");
            return;
        }

        do {
            try {
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
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (true);

    }

    private Employee newEmployee(int id) {
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
        String newDegree = choiceDegree();
        String newPosition = choicePosition();
        System.out.println("Enter salary: ");
        int newSalary = Integer.parseInt(scanner.nextLine());

        return new Employee(id, newName, newDayOfBirth, newGender, newNumberCard,
                newEmail, newPhoneNumber, newDegree, newPosition, newSalary);
    }

    private String choiceDegree() {
        System.out.println("DEGREE: \n" +
                "1. Intermediate \n" +
                "2. The Degree Of Associate\n" +
                "3. College degree\n" +
                "4. Postgraduate\n" +
                "Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice < 1 || choice > 4) {
            System.out.println("Choice not true. Enter again choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        }
        switch (choice) {
            case 1:
                return "Intermediate";
            case 2:
                return "The Degree Of Associate";
            case 3:
                return "College degree";
            case 4:
                return "Postgraduate";
        }
        return "";
    }

    private String choicePosition() {
        System.out.println("POSITION: \n" +
                "1. Receptionist\n" +
                "2. Service staff\n" +
                "3. Expert\n" +
                "4. Supervisor\n" +
                "5. Manager\n" +
                "6. General Manager\n" +
                "Enter choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice < 1 || choice > 6) {
            System.out.println("Choice not true. Enter again choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        }
        switch (choice) {
            case 1:
                return "Receptionist";
            case 2:
                return "Service staff";
            case 3:
                return "Expert";
            case 4:
                return "Supervisor";
            case 5:
                return "Manager";
            case 6:
                return "General Manager";
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

    //kiểm tra đủ tuổi hay chưa
    private boolean isCheckOldEnough(String dayOfBirth) {
        if (Regex.checkDateFormat(dayOfBirth)) {
            LocalDate localDayOfBirth = LocalDate.parse(dayOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate currentDay = LocalDate.now();
            int old = Period.between(localDayOfBirth, currentDay).getYears();
            try {
                checkOldException(old);
                return true;
            } catch (UserException userException) {
                System.err.println(userException.getMessage());
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




