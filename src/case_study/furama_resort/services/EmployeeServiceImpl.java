package case_study.furama_resort.services;

import case_study.furama_resort.models.person.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements IEmployeeService {

    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Employee> arrayListEmployee = new ArrayList<>();

    static {
        Employee employee1 = new Employee(12, "Nguyen Minh Hoang", 1998, "Male",
                "0411029867", "nguyenhoang1998@gmail.com", "Da Nang", "General Manager");
        Employee employee2 = new Employee(15, "Phan Thanh Nhan", 2003, "Male",
                "3511048798", "thanhnhan2k3@gmail.com", "Gia Lai", "Deputy General Manager");
        Employee employee3 = new Employee(18, "Tran Van Anh Quan", 2001, "Male",
                "5478123684", "anhquan2k1@gmail.com", "Da Nang", "Administration");
        Employee employee4 = new Employee(14, "Ninh Nguyen Huu Hoang", 1996, "Male",
                "0158765825", "ninhhoang96@gmail.com", "Da Nang", "Receptionist");

        arrayListEmployee.add(employee1);
        arrayListEmployee.add(employee2);
        arrayListEmployee.add(employee3);
        arrayListEmployee.add(employee4);
    }

    public void displayListEmployee() {
        for (Employee employee : arrayListEmployee) {
            System.out.println(employee);
        }
    }

    public void addToListEmployee(Employee e) {
        if (e != null) {
            for (Employee employee : arrayListEmployee) {
                if (employee.getId() == e.getId()) {
                    System.out.println("Id already exists.");
                } else {
                    arrayListEmployee.add(e);
                }
            }
        }

    }

    public void deleteInListEmployee(int id) {
        if(id != -1){
            for (Employee employee : arrayListEmployee) {
                if (employee.getId() == id) {
                    arrayListEmployee.remove(employee);
                    System.out.println("Successful delete");
                    return;
                }
            }
            System.out.println("Id doesn't exist");
        }
    }

    public void editListEmployee(Employee e) {
        if (e != null) {
            for (Employee employee : arrayListEmployee) {
                if (employee.getId() == e.getId()) {
                    arrayListEmployee.remove(employee);
                    arrayListEmployee.add(e);
                    System.out.println("Edit successfully.");
                    return;
                }
            }
            System.out.println("Id doesn't exist.");
        }
    }

    public Employee newEmployee() {
        System.out.println("Enter new Id: ");
        int newId = Integer.parseInt(scanner.nextLine());
        for (Employee employee : arrayListEmployee) {
            if (employee.getId() == newId) {
                System.out.println("Id already exists.");
                return null;
            }
        }
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
        return new Employee(newId, newName, newYearOfBirth, newGender,
                newNumberCard,newEmail,newAddress, newPosition);
    }

    public int findId() {
        System.out.println("Enter the id you want to find: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Employee employee : arrayListEmployee) {
            if (employee.getId() == id) {
                return id;
            }
        }
        System.out.println("Id doesn't exist.");
        return -1;
    }
}

