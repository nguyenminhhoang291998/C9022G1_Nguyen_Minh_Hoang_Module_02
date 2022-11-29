package case_study.furama_resort.controllers;

import case_study.furama_resort.services.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {

    private static final Scanner scanner = new Scanner(System.in);

    public FuramaController() {
    }

    public static void displayMainMenu(){
        System.out.println("---------MENU--------- \n" +
                "1.\tEmployee Management \n" +
                "2.\tCustomer Management \n" +
                "3.\tFacility Management  \n" +
                "4.\tBooking Management \n" +
                "5.\tPromotion Management \n" +
                "6.\tExit \n" +
                "Enter Choice: ");
        displayExtraMenu();
    }

    public static void displayExtraMenu(){
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice<0 || choice >6){
            System.out.println("Choice not true. Enter choice again: ");
            choice = Integer.parseInt(scanner.nextLine());
        }

        switch (choice){
            case 1:
                EmployeeServiceImpl.displayEmployeeManagement();
                break;
            case 2:
                displayCustomerManagement();
                break;
            case 3:
                displayFacilityManagement();
                break;
            case 4:
                displayBookingManagement();
                break;
            case 5:
                displayPromotionManagement();
                break;
            case 6:
                exit();
                break;
        }

    }



    public static void displayCustomerManagement(){
        System.out.println("Customer Management: \n" +
                "1.\tDisplay list customers \n" +
                "2.\tAdd new customer \n" +
                "3.\tEdit customer \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public static void displayFacilityManagement(){
        System.out.println("Facility Management: \n" +
                "1.\tDisplay list facility \n" +
                "2.\tAdd new facility \n" +
                "3.\tDisplay list facility maintenance \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public static void displayBookingManagement(){
        System.out.println("Booking Management: \n" +
                "1.\tAdd new booking \n" +
                "2.\tDisplay list booking \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public static void displayPromotionManagement (){
        System.out.println("Promotion Management : \n" +
                "1.\tDisplay list customers use service \n" +
                "2.\tDisplay list customers get voucher \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

    public static void exit(){
        System.out.println("Exit.");
    }

    public static void main(String[] args) {
        displayMainMenu();
    }

}
