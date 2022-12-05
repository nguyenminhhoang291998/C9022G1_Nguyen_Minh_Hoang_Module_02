package case_study.furama_resort.models.person;

public abstract class Person {
    private int id;
    private String name;
    private String dayOfBirth;
    private String gender;
    private String numberCard;
    private String email;
    private String phoneNumber;

    public Person() {
    }

    public Person(int id,String name, String dayOfBirth, String gender, String numberCard, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.gender = gender;
        this.numberCard = numberCard;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", year of birth=" + dayOfBirth +
                ", gender='" + gender + '\'' +
                ", number card='" + numberCard + '\'' +
                ", email='" + email + '\'' +
                ", phone number='" + phoneNumber + '\'';
    }

    public StringBuilder writeInfor(){
        return new StringBuilder(this.id + "," + this.name + "," + this.dayOfBirth + "," + this.gender + "," + this.numberCard + "," + this.email + "," + this.phoneNumber);
    }
}
