package case_study.furama_resort.services;

import case_study.furama_resort.models.person.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer>{

    void editCustomer(Customer customer);

    List<Customer> displayListCustomer();

    @Override
    void addData(Customer customer);

}
