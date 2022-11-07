package ss1.thuc_hanh;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        double bmi, weight, height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn (kg): ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của bạn (m): ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
