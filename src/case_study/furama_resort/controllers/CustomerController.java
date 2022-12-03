package case_study.furama_resort.controllers;

import case_study.furama_resort.models.person.Customer;
import case_study.furama_resort.services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {

    CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();

    public List<Customer> displayListCustomer() {
        return this.customerServiceImpl.displayListCustomer();
    }

    public void addToListCustomer(Customer customer) {
        this.customerServiceImpl.addData(customer);
    }

    public void editListCustomer(Customer customer) {
        this.customerServiceImpl.editCustomer(customer);
    }

    public boolean isIDCustomerAlreadyExists(int id){
        return customerServiceImpl.isIDCustomerAlreadyExists(id);
    }

}
