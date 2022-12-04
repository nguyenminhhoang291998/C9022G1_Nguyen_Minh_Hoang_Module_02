package case_study.furama_resort.models.person;

public class Employee extends Person {
    private String degree;
    private String position;

    private float salary;

    public Employee(int id, String name, String dayOfBirth, String gender, String numberCard, String email,
                    String phoneNumber, String degree, String position, float salary) {
        super(id, name, dayOfBirth, gender, numberCard, email, phoneNumber);
        this.degree = degree;
        this.position = position;
        this.salary = salary;
    }




    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
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

    @Override
    public String toString() {
        return "Employee{"+ super.toString() +
                "degree='" + degree + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary + " $"+
                "} " ;
    }

    @Override
    public String writeInfor() {
        return super.writeInfor() +","+ this.degree+","+ this.position+","+ this.salary;
    }
}
