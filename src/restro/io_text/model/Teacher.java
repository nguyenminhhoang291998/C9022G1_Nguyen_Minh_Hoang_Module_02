package restro.io_text.model;

public class Teacher {
    private int id;
    private String name;
    private String coach;
    private String numberPhone;

    public Teacher(int id, String name, String coach, String numberPhone) {
        this.id = id;
        this.name = name;
        this.coach = coach;
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coach='" + coach + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
