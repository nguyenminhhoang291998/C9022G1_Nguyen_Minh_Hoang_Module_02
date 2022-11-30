package case_study.furama_resort.view;

import case_study.furama_resort.controllers.FuramaController;

import java.util.Scanner;

public class FuramaView {

    FuramaController furamaController = new FuramaController();
    private static final Scanner scanner = new Scanner(System.in);


    public void displayMainMenu(){
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

    public void displayExtraMenu(){
        int choice = Integer.parseInt(scanner.nextLine());

        while (choice<0 || choice >6){
            System.out.println("Choice not true. Enter choice again: ");
            choice = Integer.parseInt(scanner.nextLine());
        }

        switch (choice){
            case 1:
                furamaController.displayEmployeeManagement();
                break;
            case 2:
//                displayCustomerManagement();
                break;
            case 3:
//                displayFacilityManagement();
                break;
            case 4:
//                displayBookingManagement();
                break;
            case 5:
//                displayPromotionManagement();
                break;
            case 6:
//                exit();
                break;
        }

    }

}
