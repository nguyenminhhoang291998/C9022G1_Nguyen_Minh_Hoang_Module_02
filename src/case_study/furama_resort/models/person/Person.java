package case_study.furama_resort.models.person;

public abstract class Person {
    private String name;
    private int yearOfBirth;
    private String gender;
    private String numberCard;
    private String email;
    private String address;

    public Person() {
    }

    public Person(String name, int yearOfBirth, String gender, String numberCard, String email, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.numberCard = numberCard;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address;
    }
}
