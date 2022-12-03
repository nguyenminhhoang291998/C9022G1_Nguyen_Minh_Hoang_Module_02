package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Employee;
import case_study.furama_resort.services.IEmployeeService;

import java.util.ArrayList;
import java.util.List;


public class EmployeeServiceImpl implements IEmployeeService {

    public static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee(12, "Nguyen Minh Hoang", "02/09/1998", "Male","0411029867",
                "nguyenhoang1998@gmail.com", "0907654354", "College degree","General Manager",30000000);
        Employee employee2 = new Employee(15, "Phan Thanh Nhan", "02/03/2003", "Male", "3511048798",
                "thanhnhan2k3@gmail.com", "0898123111","The Degree Of Associate", "Deputy General Manager",15000000);
        Employee employee3 = new Employee(18, "Tran Van Anh Quan", "09/11/2001", "Male", "5478123684",
                "anhquan2k1@gmail.com", "0909123123","Intermediate", "Administration",5000000);
        Employee employee4 = new Employee(14, "Ninh Nguyen Huu Hoang", "22/12/1996", "Male", "0158765825",
                "ninhhoang96@gmail.com", "0898777666","Postgraduate", "Receptionist",10000000);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
    }


    public List<Employee> displayListEmployee() {
        return employeeList;
    }

    public void deleteEmployee(int id) {
        for (Employee employee : employeeList) {
            if (employee.getId() == id) {
                employeeList.remove(employee);
                break;
            }
        }
    }

    @Override
    public void editEmployee(Employee employee) {
        for (Employee emp : employeeList) {
            if (employee.getId() == emp.getId()) {
                emp.setName(employee.getName());
                emp.setDayOfBirth(employee.getDayOfBirth());
                emp.setGender(employee.getGender());
                emp.setNumberCard(employee.getNumberCard());
                emp.setPhoneNumber(employee.getPhoneNumber());
                emp.setEmail(employee.getEmail());
                emp.setDegree(employee.getDegree());
                emp.setPosition(employee.getPosition());
                emp.setSalary(employee.getSalary());
            }
        }
    }


    public boolean isIDEmployeeAlreadyExists(int id) {
        for (Employee employee : employeeList) {
            if (id == employee.getId()) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void addData(Employee employee) {
        employeeList.add(employee);
    }

}

