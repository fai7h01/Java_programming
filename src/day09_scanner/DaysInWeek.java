package day09_scanner;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter the day number:");
       // int num = new Scanner(System.in).nextInt();
        int num = input.nextInt();

        String weekDay = (num >= 1 && num <= 7)?(num == 1)? "Monday" :(num == 2)? "Tueday"
                :(num == 3)? "Wednesday" :(num == 4)? "Thursday" :(num == 5)? "Friday"
                :(num == 6)? "Saturday" : "Sunday" : "Invalid";
        System.out.println("weekDay = " + weekDay);

        input.close();



    }
}
