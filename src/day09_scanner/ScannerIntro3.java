package day09_scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);  // returns char value
        System.out.println("ch = " + ch);

        System.out.println("Would you like to continue?");
        String answer = input.next();
        //String answer = input.nextLine()
        System.out.println("You entered: " + answer);


        input.close();


    }
}
