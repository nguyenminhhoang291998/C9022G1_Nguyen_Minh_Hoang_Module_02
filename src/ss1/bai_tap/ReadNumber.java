package ss1.bai_tap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Nhập số cần đọc: ");
        int number = scanner.nextInt();
        int tens = number/10;
        int ones = number%10;
        int hundreds = number/100;
        String stringHundreds = "";
        String stringTens = "";
        String stringOnes = "";

        if(number >=0 && number<20){
            switch (number){
                case 0:
                    stringOnes = "Zero";
                    break;
                case 1:
                    stringOnes= "One";
                    break;
                case 2:
                    stringOnes= "Two";
                    break;
                case 3:
                    stringOnes="Three";
                    break;
                case 4:
                    stringOnes="Four";
                    break;
                case 5:
                    stringOnes= "Five";
                    break;
                case 6:
                    stringOnes="Six";
                    break;
                case 7:
                    stringOnes="Seven";
                    break;
                case 8:
                    stringOnes="Eight";
                    break;
                case 9:
                    stringOnes="Nine";
                    break;
                case 10:
                    stringOnes="Ten";
                    break;
                case 11:
                    stringOnes="Eleven";
                    break;
                case 12:
                    stringOnes="Twelve";
                    break;
                case 13:
                    stringOnes="Thirteen";
                    break;
                case 14:
                    stringOnes="Fourteen";
                    break;
                case 15:
                    stringOnes="Fifteen";
                    break;
                case 16:
                    stringOnes="SixTeen";
                    break;
                case 17:
                    stringOnes="SevenTeen";
                    break;
                case 18:
                    stringOnes="EightTeen";
                    break;
                case 19:
                    stringOnes="NineTeen";
                    break;
            }
            System.out.println(stringOnes);

        }else if(number < 100){

            switch (tens){
                case 2:
                    stringTens = "Twenty";
                    break;
                case 3:
                    stringTens = "Thirty";
                    break;
                case 4:
                    stringTens = "Forty";
                    break;
                case 5:
                    stringTens = "Fifty";
                    break;
                case 6:
                    stringTens = "Sixty";
                    break;
                case 7:
                    stringTens = "Seventy";
                    break;
                case 8:
                    stringTens = "Eighty";
                    break;
                case 9:
                    stringTens = "Ninety";
                    break;
            }
            switch (ones){
                case 0:
                    stringOnes = " ";
                    break;
                case 1:
                    stringOnes = "-one";
                    break;
                case 2:
                    stringOnes = "-two";
                    break;
                case 3:
                    stringOnes = "-three";
                    break;
                case 4:
                    stringOnes = "-four";
                    break;
                case 5:
                    stringOnes = "-five";
                    break;
                case 6:
                    stringOnes = "-six";
                    break;
                case 7:
                    stringOnes = "-seven";
                    break;
                case 8:
                    stringOnes = "-eight";
                    break;
                case 9:
                    stringOnes = "-nine";
                    break;
            }
            System.out.println(stringTens + stringOnes);
        }else if (number<=999){
            tens = (number - (hundreds*100))/10;
            System.out.println(tens);
            ones = (number - (hundreds*100))%10;
            switch (hundreds){
                case 1:
                    stringHundreds = "One";
                    break;
                case 2:
                    stringHundreds = "Two";
                    break;
                case 3:
                    stringHundreds = "Three";
                    break;
                case 4:
                    stringHundreds = "Four";
                    break;
                case 5:
                    stringHundreds = "Five";
                    break;
                case 6:
                    stringHundreds = "Six";
                    break;
                case 7:
                    stringHundreds = "Seven";
                    break;
                case 8:
                    stringHundreds = "Eight";
                    break;
                case 9:
                    stringHundreds = "Nine";
                    break;
            }
            switch (tens){
                case 2:
                    stringTens = "Twenty ";
                    break;
                case 3:
                    stringTens = "Thirty";
                    break;
                case 4:
                    stringTens = "Forty";
                    break;
                case 5:
                    stringTens = "Fifty";
                    break;
                case 6:
                    stringTens = "Sixty";
                    break;
                case 7:
                    stringTens = "Seventy";
                    break;
                case 8:
                    stringTens = "Eighty";
                    break;
                case 9:
                    stringTens = "Ninety";
                    break;
            }
            switch (ones){
                case 0:
                    stringOnes = "  ";
                    break;
                case 1:
                    stringOnes = "-one";
                    break;
                case 2:
                    stringOnes = "-two";
                    break;
                case 3:
                    stringOnes = "-three";
                    break;
                case 4:
                    stringOnes = "-four";
                    break;
                case 5:
                    stringOnes = "-five";
                    break;
                case 6:
                    stringOnes = "-six";
                    break;
                case 7:
                    stringOnes = "-seven";
                    break;
                case 8:
                    stringOnes = "-eight";
                    break;
                case 9:
                    stringOnes = "-nine";
                    break;
            }
            System.out.println(stringHundreds+" hundreds and " +stringTens + stringOnes);


        }
    }
}
