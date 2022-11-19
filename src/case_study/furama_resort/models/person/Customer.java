package case_study.furama_resort.models.person;

public class Customer extends Person{
    private String jobDetails;

    public Customer() {
    }

    public Customer(String name, int yearOfBirth, String gender, String numberCard,
                    String email, String address, String jobDetails) {
        super(name, yearOfBirth, gender, numberCard, email, address);
        this.jobDetails = jobDetails;
    }
}
