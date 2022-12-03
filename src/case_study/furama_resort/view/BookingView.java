package case_study.furama_resort.view;

import case_study.furama_resort.controllers.BookingController;

import java.util.Scanner;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);
    private final BookingController bookingController = new BookingController();

    public void displayBookingManagement() {
        do {
            menuBookingManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                    displayListBooking();
                    break;
                case 2:
//                    addNewBooking();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void menuBookingManagement(){
        System.out.println("Booking Management: \n" +
                "1.\tAdd new booking \n" +
                "2.\tDisplay list booking \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

}
