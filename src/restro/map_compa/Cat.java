package restro.map_compa;

public class Cat implements Comparable<Cat> {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String address;

    public Cat() {
    }

    public Cat(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    

    @Override
    public int compareTo(Cat o) {
        if (this.id - o.id > 0) {
            return 1;
        } else if (this.id - o.id < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
