package case_study.furama_resort.views;

import case_study.furama_resort.common.UserException;

import java.util.Scanner;

public class FuramaView {

    private final EmployeeView employeeView = new EmployeeView();
    private final CustomerView customerView = new CustomerView();
    private final FacilityView facilityView = new FacilityView();
    private final BookingView bookingView = new BookingView();
    private final PromotionView promotionView = new PromotionView();

    private final Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() throws UserException {
        do {
            try {
                mainMenu();
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        employeeView.displayEmployeeManagement();
                        break;
                    case 2:
                        customerView.displayCustomerManagement();
                        break;
                    case 3:
                        facilityView.displayFacilityManagement();
                        break;
                    case 4:
                        bookingView.displayBookingManagement();
                        break;
                    case 5:
                        promotionView.displayPromotionManagement();
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("Choice not true. Enter choice again.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }

    private void mainMenu() {
        System.out.println("---------MENU--------- \n" +
                "1.\tEmployee Management \n" +
                "2.\tCustomer Management \n" +
                "3.\tFacility Management  \n" +
                "4.\tBooking Management \n" +
                "5.\tPromotion Management \n" +
                "6.\tExit \n" +
                "Enter Choice: ");
    }
}

