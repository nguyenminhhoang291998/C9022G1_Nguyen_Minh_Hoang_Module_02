package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Employee;
import case_study.furama_resort.services.IEmployeeService;

import java.util.ArrayList;
import java.util.Scanner;



public class EmployeeServiceImpl implements IEmployeeService {
    private static final Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee(12, "Nguyen Minh Hoang", 1998, "Male",
                "0411029867", "nguyenhoang1998@gmail.com", "Da Nang", "General Manager");
        Employee employee2 = new Employee(15, "Phan Thanh Nhan", 2003, "Male",
                "3511048798", "thanhnhan2k3@gmail.com", "Gia Lai", "Deputy General Manager");
        Employee employee3 = new Employee(18, "Tran Van Anh Quan", 2001, "Male",
                "5478123684", "anhquan2k1@gmail.com", "Da Nang", "Administration");
        Employee employee4 = new Employee(14, "Ninh Nguyen Huu Hoang", 1996, "Male",
                "0158765825", "ninhhoang96@gmail.com", "Da Nang", "Receptionist");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }

    public void displayEmployeeManagement() {
        System.out.println("Employee Management: \n" +
                "1.\tDisplay list employees \n" +
                "2.\tAdd new employee \n" +
                "3.\tDelete employee \n" +
                "4.\tEdit employee \n" +
                "5.\tReturn main menu \n" +
                "Enter choice: ");
        employeeManagement();
    }

    public void employeeManagement() {
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice < 0 || choice > 5) {
            System.out.println("Choice not true. Enter choice again: ");
            choice = Integer.parseInt(scanner.nextLine());
        }

        switch (choice) {
            case 1:
                displayListEmployee();
                displayEmployeeManagement();
                break;
            case 2:
                addToListEmployee(newEmployee(findId(false)));
                displayEmployeeManagement();
                break;
            case 3:
                deleteInListEmployee(findId(true));
                displayEmployeeManagement();
                break;
            case 4:
                editListEmployee(newEmployee(findId(true)));
                displayEmployeeManagement();
                break;
            case 5:
//                displayMainMenu();
                break;
        }
    }


    public void displayListEmployee() {
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    public void addToListEmployee(Employee e) {
        if (e != null) {
            employeeList.add(e);
        }
    }


    public void deleteInListEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                System.out.println("Successful delete.");
                break;
            }
        }
    }

    public void editListEmployee(Employee e) {
        for (Employee employee : employeeList) {
            if (employee.getId() == e.getId()) {
                employeeList.remove(employee);
                employeeList.add(e);
                System.out.println("Edit successfully.");
            }
        }
    }


    private Employee newEmployee(int id) {
        System.out.println("Enter name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter year of birth: ");
        int newYearOfBirth = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter gender: ");
        String newGender = scanner.nextLine();
        System.out.println("Enter number card: ");
        String newNumberCard = scanner.nextLine();
        System.out.println("Enter email: ");
        String newEmail = scanner.nextLine();
        System.out.println("Enter address: ");
        String newAddress = scanner.nextLine();
        System.out.println("Enter position: ");
        String newPosition = scanner.nextLine();
        return new Employee(id, newName, newYearOfBirth, newGender,
                newNumberCard, newEmail, newAddress, newPosition);
    }

    private int findId(boolean x) {
        System.out.println("Enter the id: ");
        int id = Integer.parseInt(scanner.nextLine());

            if (!x) {
                //false, tìm đến khi không trùng
                for (Employee employee : employeeList) {
                    while (employee.getId() == id) {
                        System.out.println("Id already exists. Enter again Id: ");
                        id = Integer.parseInt(scanner.nextLine());
                    }
                }
            }else {
                // true, tìm đến khi trùng
                for (Employee employee : employeeList) {
                if (employee.getId() == id) {
                    return id;
                }
                System.out.println("Not found id. Enter again Id: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return id;
    }
}

