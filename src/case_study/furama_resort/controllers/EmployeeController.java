package case_study.furama_resort.controllers;

import case_study.furama_resort.models.person.Employee;
import case_study.furama_resort.services.impl.EmployeeServiceImpl;

import java.util.List;

public class EmployeeController {
    private final EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    public List<Employee> getListEmployee() {
        return this.employeeServiceImpl.getListEmployee();
    }

    public void addToListEmployee(Employee employee) {
        this.employeeServiceImpl.addData(employee);
    }


    public void deleteInListEmployee(int id) {
        this.employeeServiceImpl.deleteEmployee(id);
    }

    public void editListEmployee(Employee employee) {
        this.employeeServiceImpl.editEmployee(employee);
    }

    public boolean isIDEmployeeAlreadyExists(int id){
        return employeeServiceImpl.isIDEmployeeAlreadyExists(id);
    }
}
