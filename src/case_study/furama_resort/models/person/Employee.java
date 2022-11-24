package case_study.furama_resort.models.person;

public class Employee extends Person{
    private int id;
    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee() {
    }

    public Employee(int id,String name, int yearOfBirth, String gender, String numberCard,
                    String email, String address, String position) {
        super(name, yearOfBirth, gender, numberCard, email, address);
        this.position = position;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id  + super.toString() + '\'' +
                ", position='" + position+
                "} "
                ;
    }
}
