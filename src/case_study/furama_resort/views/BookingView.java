package case_study.furama_resort.views;

import case_study.furama_resort.common.Regex;
import case_study.furama_resort.controllers.BookingController;
import case_study.furama_resort.controllers.CustomerController;
import case_study.furama_resort.controllers.FacilityController;
import case_study.furama_resort.models.booking.Booking;
import case_study.furama_resort.models.facility.Facility;
import case_study.furama_resort.models.person.Customer;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BookingView {
    private static final Scanner scanner = new Scanner(System.in);
    private final BookingController bookingController = new BookingController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();

    public void displayBookingManagement() {
        do {
            menuBookingManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewBooking();
                    break;
                case 2:
                    displayListBooking();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void displayListBooking() {
        Set<Booking> listBooking = this.bookingController.getListBooking();
        for (Booking booking: listBooking) {
            System.out.println(booking.toString());
        }
    }

    private void addNewBooking(){
        System.out.println("Enter ID booking: ");
        String idBooking = scanner.nextLine();

        int customerChoice = displayAndChoiceCustomer();
        String facilityChoice = displayAndChoiceFacility();

        if (customerChoice == 0 && facilityChoice == null) {
            System.out.println("Data Customer or Facility not ready exists!");
            return;
        }

        System.out.println("Enter start day (dd/mm/yyyy): ");
        String startDay = scanner.nextLine();
        while (!Regex.checkDateFormat(startDay)) {
            System.out.println("Enter start day (dd/mm/yyyy): ");
            startDay = scanner.nextLine();
        }
        LocalDate localStartDate = LocalDate.parse(startDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Enter end day (dd/mm/yyyy): ");
        String endDay = scanner.nextLine();
        while (!Regex.checkDateFormat(endDay)) {
            System.out.println("Enter end day (dd/mm/yyyy): ");
            endDay = scanner.nextLine();
        }
        LocalDate localEndDate = LocalDate.parse(endDay, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int days = Period.between(localStartDate,localEndDate).getDays();
        if(days<=0){
            System.out.println("Invalid data. Start day always less then end day.");
            return;
        }
        System.out.println("Successful add.");
        Booking newBooking = new Booking(idBooking,startDay,endDay,customerChoice,facilityChoice);
        bookingController.addNewBooking(newBooking);
    }

    private String displayAndChoiceFacility() {
        Map<Facility, Integer> facilityList = this.facilityController.getListFacility();
        if (facilityList.isEmpty()) {
            System.out.println("List facility is empty.");
            return null;
        }
        System.out.println("-----------LIST FACILITY------------");
        Set<Map.Entry<Facility, Integer>> setFacilityList = facilityList.entrySet();
        for (Map.Entry<Facility, Integer> entryFacility : setFacilityList) {
            System.out.println(entryFacility.getKey() + ", " + entryFacility.getValue());
        }
        do {
            System.out.println("Enter choice id facility: ");
            String idChoice = scanner.nextLine();
            for (Map.Entry<Facility, Integer> entryFacility : setFacilityList) {
                if (Objects.equals(entryFacility.getKey().getIdFacility(), idChoice)) {
                    return idChoice;
                }
            }
            System.out.print("Choice id not true. ");
        } while (true);
    }

    private int displayAndChoiceCustomer() {
        List<Customer> customerList = this.customerController.getListCustomer();
        if (customerList.isEmpty()) {
            System.out.println("List customer is empty.");
            return 0;
        }
        System.out.println("-----------LIST CUSTOMER------------");
        for (Customer ctm : customerList) {
            System.out.println(ctm);
        }
        do {
            System.out.println("Enter choice id customer: ");
            int idChoice = Integer.parseInt(scanner.nextLine());
            for (Customer ctm : customerList) {
                if (ctm.getId() == idChoice) {
                    return idChoice;
                }
            }
            System.out.print("Choice id not true. ");
        } while (true);
    }

    private void menuBookingManagement() {
        System.out.println("Booking Management: \n" +
                "1.\tAdd new booking \n" +
                "2.\tDisplay list booking \n" +
                "3.\tReturn main menu \n" +
                "Enter choice: ");
    }

}
