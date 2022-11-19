package case_study.furama_resort.services;

import case_study.furama_resort.models.person.Employee;

import java.util.ArrayList;

public class EmployeeServiceImpl implements IEmployeeService{
    public static ArrayList<Employee> arrayListEmployee = new ArrayList<>();

    static {
        Employee employee1 = new Employee("Nguyen Minh Hoang",1998,"Male",
            "0411029867","nguyenhoang1998@gmail.com","Da Nang","General Manager");
        Employee employee2 = new Employee("Phan Thanh Nhan",2003,"Male",
                "3511048798","thanhnhan2k3@gmail.com","Gia Lai","Deputy General Manager");
        Employee employee3 = new Employee("Tran Van Anh Quan",2001,"Male",
                "5478123684","anhquan2k1@gmail.com","Da Nang","Administration");
        Employee employee4 = new Employee("Ninh Nguyen Huu Hoang",1996,"Male",
                "0158765825","ninhhoang96@gmail.com","Da Nang","Receptionist");

        arrayListEmployee.add(employee1);
        arrayListEmployee.add(employee2);
        arrayListEmployee.add(employee3);
        arrayListEmployee.add(employee4);
    }

    public void displayListEmployee(){
        System.out.println(arrayListEmployee);
    }

    public void addToListEmployee(Employee e){
        arrayListEmployee.add(e);
        System.out.println(arrayListEmployee);
    }


}
