package case_study.furama_resort.models.booking;

public class Booking {
    private String idBooking;
    private String startDay;
    private String endDay;
    private int idCustomer;
    private String IdFacility;

    public Booking(String idBooking, String startDay, String endDay, int idCustomer, String IdFacility) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.endDay = endDay;
        this.idCustomer = idCustomer;
        this.IdFacility = IdFacility;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdFacility() {
        return IdFacility;
    }

    public void setIdFacility(String facilityID) {
        this.IdFacility = facilityID;
    }

    public StringBuilder writeInfor() {
        return new StringBuilder().append(this.idBooking).append(",").append(this.startDay).append(",")
                .append(this.endDay).append(",").append(this.idCustomer).append(",").append(this.IdFacility);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", endDay='" + endDay + '\'' +
                ", idCustomer=" + idCustomer +
                ", IdFacility='" + IdFacility + '\'' +
                '}';
    }
}
