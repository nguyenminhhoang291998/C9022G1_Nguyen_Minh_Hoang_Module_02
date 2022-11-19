package case_study.furama_resort.models.person;

public class Employee extends Person{
    private String position;


    public Employee() {
    }

    public Employee(String name, int yearOfBirth, String gender, String numberCard,
                    String email, String address, String position) {
        super(name, yearOfBirth, gender, numberCard, email, address);
        this.position = position;
    }
}
