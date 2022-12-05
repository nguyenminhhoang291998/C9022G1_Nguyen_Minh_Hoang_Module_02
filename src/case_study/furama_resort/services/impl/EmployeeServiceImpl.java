package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.person.Employee;
import case_study.furama_resort.services.IEmployeeService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeServiceImpl implements IEmployeeService {

    private final String PATH_FILE_EMPLOYEE = "src/case_study/furama_resort/data/employee.csv";

    static {
//        Employee employee1 = new Employee(12, "Nguyen Minh Hoang", "02/09/1998", "Male", "0411029867",
//                "nguyenhoang1998@gmail.com", "0907654354", "College degree", "General Manager", 1000);
//        Employee employee2 = new Employee(15, "Phan Thanh Nhan", "02/03/2003", "Male", "3511048798",
//                "thanhnhan2k3@gmail.com", "0898123111", "The Degree Of Associate", "Deputy General Manager", 323.5f);
//        Employee employee3 = new Employee(18, "Tran Van Anh Quan", "09/11/2001", "Male", "5478123684",
//                "anhquan2k1@gmail.com", "0909123123", "Intermediate", "Administration", 209.8f);
//        Employee employee4 = new Employee(14, "Ninh Nguyen Huu Hoang", "22/12/1996", "Male", "0158765825",
//                "ninhhoang96@gmail.com", "0898777666", "Postgraduate", "Receptionist", 150);

    }


    public List<Employee> getListEmployee() {
        return this.readFile();
    }

    @Override
    public void addData(Employee employee) {
        if(isIDEmployeeAlreadyExists(employee.getId())){
            System.out.println("The ID you want to add already exists.");
            return;
        }
        List<Employee> eplList = readFile();
        eplList.add(employee);
        writeFile(eplList);
    }

    public void deleteEmployee(int id) {
        if(!isIDEmployeeAlreadyExists(id)){
            System.out.println("The ID you want to delete dose not already exists.");
            return;
        }
        List<Employee> eplList = readFile();
        for (Employee employee : eplList) {
            if (employee.getId() == id) {
                eplList.remove(employee);
                break;
            }
        }
        writeFile(eplList);
    }

    @Override
    public void editEmployee(Employee employee) {
        if(!isIDEmployeeAlreadyExists(employee.getId())){
            System.out.println("The ID you want to edit dose not already exists.");
            return;
        }
        List<Employee> eplList = readFile();
        for (Employee emp : eplList) {
            if (employee.getId() == emp.getId()) {
                emp.setName(employee.getName());
                emp.setDayOfBirth(employee.getDayOfBirth());
                emp.setGender(employee.getGender());
                emp.setNumberCard(employee.getNumberCard());
                emp.setPhoneNumber(employee.getPhoneNumber());
                emp.setEmail(employee.getEmail());
                emp.setDegree(employee.getDegree());
                emp.setPosition(employee.getPosition());
                emp.setSalary(employee.getSalary());
                break;
            }
        }
    }

    public boolean isIDEmployeeAlreadyExists(int id) {
        List<Employee> eplList = readFile();
        for (Employee employee : eplList) {
            if (id == employee.getId()) {
                return true;
            }
        }
        return false;
    }


    private List<Employee> readFile() {
        List<Employee> eplList = new ArrayList<>();
        try {
            File file = new File(PATH_FILE_EMPLOYEE);
            if(!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] employee = line.split(",");
                eplList.add(new Employee(Integer.parseInt(employee[0]), employee[1], employee[2], employee[3],
                        employee[4], employee[5], employee[6], employee[7], employee[8], Float.parseFloat(employee[9])));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc" +
                    "nội dung có lỗi!");
        } catch (Exception ex){
            return eplList;
        }
        return eplList;
    }

    private void writeFile(List<Employee> eplList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE_EMPLOYEE));
            for (Employee employee: eplList) {
                bufferedWriter.write(employee.writeInfor().toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

