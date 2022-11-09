package ss4_object.thuc_hanh.QuadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá trị b: ");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá trị c: ");
        double c = Double.parseDouble(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("Nghiệm thứ nhất là: "+ quadraticEquation.getRoot1());
            System.out.println("Nghiệm thứ hai là: "+ quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant()==0){
            System.out.println("Phương trình có 1 nghiệm: "+ quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
