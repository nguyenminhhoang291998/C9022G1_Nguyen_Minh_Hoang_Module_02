package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Customer;
import case_study.furama_resort.services.ICustomerService;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements ICustomerService {

    private static final Scanner scanner = new Scanner(System.in);

    private static final LinkedList<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer(1,"Tran Mai",1967,"Male",
                "08768162","nguyenmai@gmail.com","Ha Noi");
        Customer customer2 = new Customer(2,"Phan Thanh",1998,"Male",
                "098762721","phanthanh@gmail.com","Hue");
        Customer customer3 = new Customer(3,"Tran Thi Hai",1960,"Female",
                "283719278","hanh1960@gmail.com","Ho Chi Minh");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }
}
