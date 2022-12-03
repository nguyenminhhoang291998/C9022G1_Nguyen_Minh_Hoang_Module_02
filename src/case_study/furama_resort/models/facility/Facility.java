package case_study.furama_resort.models.facility;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private float usableArea;
    private float rentalCosts;
    private int maximumNumberOfPeople;
    private String typeHire;

    public Facility(String idFacility, String nameFacility, float usableArea, float rentalCosts,
                    int maximumNumberOfPeople, String typeHire) {
        this.idFacility = idFacility;
        this.nameFacility = nameFacility;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.typeHire = typeHire;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(String nameFacility) {
        this.nameFacility = nameFacility;
    }

    public float getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public float getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getTypeHire() {
        return typeHire;
    }

    public void setTypeHire(String typeHire) {
        this.typeHire = typeHire;
    }

    @Override
    public String toString() {
        return  " name facility='" + nameFacility + '\'' +
                ", usable area=" + usableArea + "m2" +
                ", rental costs=" + rentalCosts + "$"+
                ", maximum number of people=" + maximumNumberOfPeople +
                ", type hire='" + typeHire + '\'' +
                '}';
    }
}
