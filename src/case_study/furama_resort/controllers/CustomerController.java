package case_study.furama_resort.controllers;

import case_study.furama_resort.models.person.Customer;
import case_study.furama_resort.services.ICustomerService;
import case_study.furama_resort.services.impl.CustomerServiceImpl;

import java.util.List;

public class CustomerController {

    private final ICustomerService customerServiceImpl = new CustomerServiceImpl();

    public List<Customer> getListCustomer() {
        return this.customerServiceImpl.getListCustomer();
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
