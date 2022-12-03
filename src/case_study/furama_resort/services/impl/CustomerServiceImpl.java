package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Customer;
import case_study.furama_resort.services.ICustomerService;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    private static final List<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer(1,"Tran Mai","02/02/1967","Male",
                "08768162","nguyenmai@gmail.com","0962716541","Diamond","Ha Noi");
        Customer customer2 = new Customer(2,"Phan Thanh","03/12/1998","Male",
                "098762721","phanthanh@gmail.com","0452162766","Platinum","Hue");
        Customer customer3 = new Customer(3,"Tran Thi Hai","22/12/1960","Female",
                "283719278","hanh1960@gmail.com","0876676767","Gold","Ho Chi Minh");
        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
    }

    @Override
    public void editCustomer(Customer customer) {
        for (Customer ctm : customerList) {
            if (customer.getId() == ctm.getId()) {
                ctm.setName(customer.getName());
                ctm.setDayOfBirth(customer.getDayOfBirth());
                ctm.setGender(customer.getGender());
                ctm.setNumberCard(customer.getNumberCard());
                ctm.setPhoneNumber(customer.getPhoneNumber());
                ctm.setEmail(customer.getEmail());
                ctm.setType(customer.getType());
                ctm.setAddress(customer.getAddress());
            }
        }
    }

    @Override
    public List<Customer> displayListCustomer() {
        return customerList;
    }

    @Override
    public void addData(Customer customer) {
        customerList.add(customer);
    }

    public boolean isIDCustomerAlreadyExists(int id) {
        for (Customer customer : customerList) {
            if (id == customer.getId()) {
                return true;
            }
        }
        return false;
    }
}
