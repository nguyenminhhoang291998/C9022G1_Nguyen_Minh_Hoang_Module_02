package case_study.furama_resort.models.facility;

public class Room extends Facility {
    private String freeService;

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    public Room(String idFacility, String nameFacility, float usableArea, float rentalCosts,
                int maximumNumberOfPeople, String typeHire, String freeService) {
        super(idFacility, nameFacility, usableArea, rentalCosts, maximumNumberOfPeople, typeHire);
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return  super.toString()+
                ", free Service='" + freeService + '\'' +
                "}, times of used: " ;
    }

    public StringBuilder writeInfor(){
        return super.writeInfor().append(",").append(this.freeService);
    }
}
