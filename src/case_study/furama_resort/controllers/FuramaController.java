package case_study.furama_resort.controllers;

import case_study.furama_resort.services.impl.EmployeeServiceImpl;

public class FuramaController {

    EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();

    public void displayEmployeeManagement(){
        this.employeeServiceImpl.displayEmployeeManagement();
    }


    public void displayCustomerManagement(){
        System.out.println("Customer Management: \n" +
                "1.\tDisplay list customers \n" +
                "2.\tAdd new customer \n" +
                "3.\tEdit customer \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public void displayFacilityManagement(){
        System.out.println("Facility Management: \n" +
                "1.\tDisplay list facility \n" +
                "2.\tAdd new facility \n" +
                "3.\tDisplay list facility maintenance \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public void displayBookingManagement(){
        System.out.println("Booking Management: \n" +
                "1.\tAdd new booking \n" +
                "2.\tDisplay list booking \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public void displayPromotionManagement (){
        System.out.println("Promotion Management : \n" +
                "1.\tDisplay list customers use service \n" +
                "2.\tDisplay list customers get voucher \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public void exit(){
        System.out.println("Exit.");
    }



}
