package ss4_object.thuc_hanh.Fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"yellow",true);
        Fan fan2 = new Fan(1,5,"blue",false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

}
