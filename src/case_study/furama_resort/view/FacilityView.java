package case_study.furama_resort.view;

import case_study.furama_resort.common.Common;
import case_study.furama_resort.controllers.FacilityController;
import case_study.furama_resort.models.facility.Room;
import case_study.furama_resort.models.facility.Villa;

import java.util.Scanner;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);
    private final FacilityController facilityController = new FacilityController();
    private final Common common = new Common();


    public void displayFacilityManagement() {
        do {
            menuFacilityManagement();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayListFacility();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    displayListFacilityMaintenance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choice not true. Enter choice again.");
                    break;
            }
        } while (true);
    }

    private void displayListFacility() {
        System.out.println(this.facilityController.displayListFacility());
    }

    private void displayListFacilityMaintenance() {
        System.out.println(this.facilityController.displayFacilityMaintenance());
    }


    private void menuFacilityManagement() {
        System.out.println("Facility Management: \n" +
                "1.\tDisplay list facility \n" +
                "2.\tAdd new facility \n" +
                "3.\tDisplay list facility maintenance \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    private void addNewFacility() {
        do {
            System.out.println("Add new facility: \n" +
                    "1.\tAdd new villa \n" +
                    "2.\tAdd new room \n" +
                    "4.\tBack to menu \n" +
                    "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewVilla();
                case 2:
                    addNewRoom();
                case 3:
                    return;
            }
        } while (true);

    }

    private void addNewVilla() {
        do {
            System.out.println("Enter the ID you wish to add (SVVL-XXXX): ");
            String idFacility = (String) checkRegex(common.ID_VILLA_REGEX);
            boolean isIDEmployeeAlreadyExists = this.facilityController.isIDFacilityAlreadyExists(idFacility);

            if (isIDEmployeeAlreadyExists) {
                System.out.print("Id already exists. ");
            } else {
                Villa newVilla = getInformationNewVilla(idFacility);
                this.facilityController.addToListFacility(newVilla);
                System.out.println("Successful add.");
                break;
            }

        } while (true);

    }

    private void addNewRoom() {
        do {
            System.out.println("Enter the ID you wish to add (SVRO-XXXX) : ");
            String idFacility = (String) checkRegex(common.ID_ROOM_REGEX);
            boolean isIDEmployeeAlreadyExists = this.facilityController.isIDFacilityAlreadyExists(idFacility);

            if (isIDEmployeeAlreadyExists) {
                System.out.print("Id already exists. ");
            } else {
                Room newRoom = getInformationNewRoom(idFacility);
                this.facilityController.addToListFacility(newRoom);
                System.out.println("Successful add.");
                break;
            }

        } while (true);
    }

    private Villa getInformationNewVilla(String newIDFacility) {
        System.out.println("Enter name facility: ");
        String newNameFacility = (String) checkRegex(common.NAME_REGEX);
        System.out.println("Enter usable area(m2): ");
        float newUsableArea = (float) checkRegex(common.AREA_REGEX);
        System.out.println("Enter rental costs($): ");
        float newRentalCosts = (float) checkRegex(common.RENTAL_COSTS);
        System.out.println("Enter maximum number of people:  ");
        int newMaximumNumberOfPeople = (int) checkRegex(common.MAXIMUM_NUMBER_OF_PEOPLE);
        System.out.println("Enter type hire: ");
        String newTypeHire = (String) checkRegex(common.NAME_REGEX);
        System.out.println("Enter room standards: ");
        String newRoomStandards = (String) checkRegex(common.NAME_REGEX);
        System.out.println("Enter pool area(m2): ");
        float newPoolArea = (float) checkRegex(common.AREA_REGEX);
        System.out.println("Enter floor count: ");
        int newFloorCount = (int) checkRegex(common.FLOOR_COUNT);

        return new Villa(newIDFacility, newNameFacility, newUsableArea, newRentalCosts,
                newMaximumNumberOfPeople, newTypeHire, newRoomStandards, newPoolArea, newFloorCount);
    }

    private Object checkRegex(String regex) {
        boolean flag;
        String o;
        do {
            o = scanner.nextLine();
            flag = o.matches(regex);
            if (!flag) System.out.print("Invalid data. Enter again: ");
        } while (!flag);
        return o;
    }

    private Room getInformationNewRoom(String newIDFacility) {
        System.out.println("Enter usable area(m2): ");
        float newUsableArea = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter rental costs($): ");
        float newRentalCosts = Float.parseFloat(scanner.nextLine());
        System.out.println("Enter maximum number of people: ");
        int newMaximumNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter type hire: ");
        String newTypeHire = scanner.nextLine();
        System.out.println("Enter free service: ");
        String newFreeService = scanner.nextLine();

        return new Room(newIDFacility, "VILLA", newUsableArea, newRentalCosts,
                newMaximumNumberOfPeople, newTypeHire, newFreeService);
    }

}
