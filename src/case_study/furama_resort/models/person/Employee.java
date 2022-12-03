package case_study.furama_resort.models.person;

public class Employee extends Person{
    private String degree;
    private String position;

    private int salary;

    public Employee(int id, String name, String dayOfBirth, String gender, String numberCard, String email, String phoneNumber, String degree, String position, int salary) {
        super(id, name, dayOfBirth, gender, numberCard, email, phoneNumber);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee() {
    }


}
