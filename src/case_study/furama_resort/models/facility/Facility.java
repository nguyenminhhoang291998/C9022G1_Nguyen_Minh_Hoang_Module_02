package case_study.furama_resort.models.facility;

import java.util.Objects;

public abstract class Facility {
    private String idFacility;
    private String nameFacility;
    private float usableArea;
    private float rentalCosts;
    private int maximumNumberOfPeople;
    private String typeHire;

    protected Facility(String idFacility, String nameFacility, float usableArea, float rentalCosts,
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
        return  "{ ID facility='" + idFacility + '\'' +
                ", name facility='" + nameFacility + '\'' +
                ", usable area=" + usableArea + "m2" +
                ", rental costs=" + rentalCosts + "$"+
                ", maximum number of people=" + maximumNumberOfPeople +
                ", type hire='" + typeHire + '\'' ;
    }

    public StringBuilder writeInfor(){
        return new StringBuilder().append(this.idFacility).append(",").append(this.nameFacility).append(",").
                append(this.usableArea).append(",").append(this.rentalCosts).append(",").
                append(this.maximumNumberOfPeople).append(",").append(this.typeHire);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(idFacility, facility.idFacility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idFacility);
    }
}
