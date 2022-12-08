package case_study.furama_resort.services;

import case_study.furama_resort.models.person.Customer;

import java.util.List;

public interface ICustomerService extends IService<Customer>{
    List<Customer> getListCustomer();

    void editCustomer(Customer customer);

    boolean isIDCustomerAlreadyExists(int id);

}
