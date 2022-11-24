package restro.exception;

public class Ghost{
    private String name;
    private String power;

    public Ghost() {
    }

    public Ghost(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Ghost{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }

//    @Override
//    public int compare(Ghost o1, Ghost o2) {
//        return o1.getName().compareTo(o2.getName());
//    }


//    @Override
//    public int compareTo(Ghost o) {
//        if(this.name.compareTo(o.name) < 0){
//            return 1;
//        }else if(this.name.compareTo(o.name) > 0){
//            return -1;
//        }
//        return 0;
//    }
}
