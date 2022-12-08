package case_study.furama_resort.services;

import case_study.furama_resort.models.person.Employee;

import java.util.List;

public interface IEmployeeService extends IService<Employee>{
    void deleteEmployee(int id);

    void editEmployee(Employee employee);

    List<Employee> getListEmployee();

    boolean isIDEmployeeAlreadyExists(int id);

}
