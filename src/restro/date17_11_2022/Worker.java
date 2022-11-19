package restro.date17_11_2022;

public class Worker {
    private String name;
    private String address;

    public Worker() {
    }

    public Worker(String name, String address) {
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
        return "Worker{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
//
//    @Override
//    public int compareTo(Worker o) {
//        if(this.getName().compareTo(o.getName()) > 0){
//            return 1;
//        }else if(this.getName().compareTo(o.getName()) < 0){
//            return -1;
//        }else {
//            return 0;
//        }
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Worker worker = (Worker) o;
//        return Objects.equals(name, worker.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }


}
