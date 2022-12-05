package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Customer;
import case_study.furama_resort.services.ICustomerService;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {

    private final String PATH_FILE_CUSTOMER = "src/case_study/furama_resort/data/customer.csv";

    static {
//        Customer customer1 = new Customer(1,"Tran Mai","02/02/1967","Male",
//                "08768162","nguyenmai@gmail.com","0962716541","Diamond","Ha Noi");
//        Customer customer2 = new Customer(2,"Phan Thanh","03/12/1998","Male",
//                "098762721","phanthanh@gmail.com","0452162766","Platinum","Hue");
//        Customer customer3 = new Customer(3,"Tran Thi Hai","22/12/1960","Female",
//                "283719278","hanh1960@gmail.com","0876676767","Gold","Ho Chi Minh");
//        customerList.add(customer1);
//        customerList.add(customer2);
//        customerList.add(customer3);
    }


    @Override
    public List<Customer> getListCustomer() {
        return this.readFile();
    }

    @Override
    public void addData(Customer customer) {
        if(isIDCustomerAlreadyExists(customer.getId())){
            System.out.println("The ID you want to add already exists.");
            return;
        }
        List<Customer> ctmList = readFile();
        ctmList.add(customer);
        writeFile(ctmList);
    }

    @Override
    public void editCustomer(Customer customer) {
        if(!isIDCustomerAlreadyExists(customer.getId())){
            System.out.println("The ID you want to edit does not already exist.");
            return;
        }
        List<Customer> ctmList = readFile();
        for (Customer ctm : ctmList) {
            if (customer.getId() == ctm.getId()) {
                ctm.setName(customer.getName());
                ctm.setDayOfBirth(customer.getDayOfBirth());
                ctm.setGender(customer.getGender());
                ctm.setNumberCard(customer.getNumberCard());
                ctm.setPhoneNumber(customer.getPhoneNumber());
                ctm.setEmail(customer.getEmail());
                ctm.setType(customer.getType());
                ctm.setAddress(customer.getAddress());
                break;
            }
        }
        writeFile(ctmList);
    }

    public boolean isIDCustomerAlreadyExists(int id) {
        List<Customer> ctmList = readFile();
        for (Customer customer : ctmList) {
            if (id == customer.getId()) {
                return true;
            }
        }
        return false;
    }

    private List<Customer> readFile() {
        List<Customer> ctmList = new LinkedList<>();
        try {
            File file = new File(PATH_FILE_CUSTOMER);
            if(!file.exists()){
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] customer = line.split(",");
                ctmList.add(new Customer(Integer.parseInt(customer[0]), customer[1], customer[2], customer[3],
                        customer[4], customer[5], customer[6], customer[7], customer[8]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc" +
                    "nội dung có lỗi!");
        } catch (Exception ex){
            return ctmList;
        }
        return ctmList;
    }

    private void writeFile(List<Customer> ctmList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE_CUSTOMER));
            for (Customer customer : ctmList) {
                bufferedWriter.write(customer.writeInfor().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
