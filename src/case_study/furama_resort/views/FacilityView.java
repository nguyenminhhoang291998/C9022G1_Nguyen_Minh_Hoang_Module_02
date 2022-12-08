package case_study.furama_resort.views;

import case_study.furama_resort.common.Regex;
import case_study.furama_resort.controllers.FacilityController;
import case_study.furama_resort.models.facility.Facility;
import case_study.furama_resort.models.facility.Room;
import case_study.furama_resort.models.facility.Villa;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FacilityView {
    private static final Scanner scanner = new Scanner(System.in);
    private final FacilityController facilityController = new FacilityController();

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

    private void menuFacilityManagement() {
        System.out.println("Facility Management: \n" +
                "1.\tDisplay list facility \n" +
                "2.\tAdd new facility \n" +
                "3.\tDisplay list facility maintenance \n" +
                "4.\tReturn main menu \n" +
                "Enter choice: ");
    }

    private void displayListFacility() {
        Map<Facility, Integer> facilityList = this.facilityController.getListFacility();
        if(facilityList.isEmpty()){
            System.out.println("List facility is empty.");
            return;
        }
        Set<Map.Entry<Facility, Integer>> setFacilityList = facilityList.entrySet();

        System.out.println("-----------LIST FACILITY------------");
        for (Map.Entry<Facility, Integer> i : setFacilityList) {
            System.out.println(i.getKey().toString() + i.getValue());
        }
    }

    private void displayListFacilityMaintenance() {
        Map<Facility, Integer> facilityListMaintenance = this.facilityController.getFacilityMaintenance();
        if(facilityListMaintenance.isEmpty()){
            System.out.println("List facility maintenance is empty.");
            return;
        }
        Set<Map.Entry<Facility, Integer>> setFacilityMaintenanceList = facilityListMaintenance.entrySet();

        System.out.println("-----------LIST FACILITY MAINTENANCE------------");
        for (Map.Entry<Facility, Integer> i : setFacilityMaintenanceList) {
            System.out.println(i.getKey().toString() + i.getValue());
        }
    }

    private void addNewFacility() {
        do {
            System.out.println("Add new facility: \n" +
                    "1.\tAdd new villa \n" +
                    "2.\tAdd new room \n" +
                    "3.\tBack to menu \n" +
                    "Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewRoom();
                    break;
                case 3:
                    return;
            }
        } while (true);

    }

    private void addNewVilla() {
        System.out.println("Enter the ID you wish to add (SVVL-XXXX): ");
        String idFacility = Regex.inputAndCheckRegex(Regex.ID_VILLA_REGEX);
        boolean isIDEmployeeAlreadyExists = this.facilityController.isIDFacilityAlreadyExists(idFacility);

        if (isIDEmployeeAlreadyExists) {
            System.out.println("Id already exists. ");
        } else {
            Villa newVilla = getInformationNewVilla(idFacility);
            this.facilityController.addToListFacility(newVilla);
            System.out.println("Successful add.");
        }
    }

    private void addNewRoom() {
        System.out.println("Enter the ID you wish to add (SVRO-XXXX) : ");
        String idFacility = Regex.inputAndCheckRegex(Regex.ID_ROOM_REGEX);
        boolean isIDEmployeeAlreadyExists = this.facilityController.isIDFacilityAlreadyExists(idFacility);

        if (isIDEmployeeAlreadyExists) {
            System.out.println("Id already exists. ");
        } else {
            Room newRoom = getInformationNewRoom(idFacility);
            this.facilityController.addToListFacility(newRoom);
            System.out.println("Successful add.");
        }
    }

    private Villa getInformationNewVilla(String newIDFacility) {
        System.out.println("Enter name villa: ");
        String newNameVilla = Regex.inputAndCheckRegex(Regex.NAME_REGEX);
        System.out.println("Enter usable area(m2): ");
        float newUsableArea = Float.parseFloat(Regex.inputAndCheckRegex(Regex.AREA_REGEX));
        System.out.println("Enter rental costs($): ");
        float newRentalCosts = Float.parseFloat(Regex.inputAndCheckRegex(Regex.RENTAL_COSTS_REGEX));
        System.out.println("Enter maximum number of people:  ");
        int newMaximumNumberOfPeople = Integer.parseInt(Regex.inputAndCheckRegex(Regex.MAXIMUM_NUMBER_OF_PEOPLE_REGEX));
        System.out.println("Enter type hire: ");
        String newTypeHire = Regex.inputAndCheckRegex(Regex.NAME_REGEX);
        System.out.println("Enter room standards: ");
        String newRoomStandards = Regex.inputAndCheckRegex(Regex.NAME_REGEX);
        System.out.println("Enter pool area(m2): ");
        float newPoolArea = Float.parseFloat(Regex.inputAndCheckRegex(Regex.AREA_REGEX));
        System.out.println("Enter floor count: ");
        int newFloorCount = Integer.parseInt(Regex.inputAndCheckRegex(Regex.FLOOR_COUNT));

        return new Villa(newIDFacility, newNameVilla, newUsableArea, newRentalCosts,
                newMaximumNumberOfPeople, newTypeHire, newRoomStandards, newPoolArea, newFloorCount);
    }

    private Room getInformationNewRoom(String newIDFacility) {
        System.out.println("Enter name room: ");
        String newNameRoom = Regex.inputAndCheckRegex(Regex.NAME_REGEX);
        System.out.println("Enter usable area(m2): ");
        float newUsableArea = Float.parseFloat(Regex.inputAndCheckRegex(Regex.AREA_REGEX));
        System.out.println("Enter rental costs($): ");
        float newRentalCosts = Float.parseFloat(Regex.inputAndCheckRegex(Regex.RENTAL_COSTS_REGEX));
        System.out.println("Enter maximum number of people: ");
        int newMaximumNumberOfPeople = Integer.parseInt(Regex.inputAndCheckRegex(Regex.MAXIMUM_NUMBER_OF_PEOPLE_REGEX));
        System.out.println("Enter type hire: ");
        String newTypeHire = Regex.inputAndCheckRegex(Regex.NAME_REGEX);
        System.out.println("Enter free service: ");
        String newFreeService = scanner.nextLine();

        return new Room(newIDFacility, newNameRoom, newUsableArea, newRentalCosts,
                newMaximumNumberOfPeople, newTypeHire, newFreeService);
    }


}
