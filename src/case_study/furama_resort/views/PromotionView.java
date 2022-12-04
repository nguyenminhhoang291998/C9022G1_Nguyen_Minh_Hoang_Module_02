package case_study.furama_resort.views;

import java.util.Scanner;

public class PromotionView {
    private static final Scanner scanner = new Scanner(System.in);


    public void displayPromotionManagement() {
        do {
            menuPromotionManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                   displayListCustomersUseService();
                    break;
                case 2:
//                    displayListCustomersGetVoucher();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void menuPromotionManagement(){
        System.out.println("Promotion Management : \n" +
                "1.\tDisplay list customers use service \n" +
                "2.\tDisplay list customers get voucher \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

}
