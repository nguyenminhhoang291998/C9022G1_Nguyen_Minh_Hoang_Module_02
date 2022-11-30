package case_study.furama_resort.models.person;

public abstract class Person {
    private int id;
    private String name;
    private int yearOfBirth;
    private String gender;
    private String numberCard;
    private String email;
    private String address;

    public Person() {
    }

    public Person(int id,String name, int yearOfBirth, String gender, String numberCard, String email, String address) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.numberCard = numberCard;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", gender='" + gender + '\'' +
                ", numberCard='" + numberCard + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
