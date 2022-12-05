package case_study.furama_resort.models.person;

public class Customer extends Person{
    private String type;
    private String address;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer(int id, String name, String dayOfBirth, String gender, String numberCard, String email,
                    String phoneNumber, String type, String address) {
        super(id, name, dayOfBirth, gender, numberCard, email, phoneNumber);
        this.type = type;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{"+ super.toString() +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                "} " ;
    }
    @Override
    public StringBuilder writeInfor() {
        return new StringBuilder(super.writeInfor() + "," + this.type + "," + this.address);
    }
}
