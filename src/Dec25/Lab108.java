package src.Dec25;

import java.util.Scanner;

public class Lab108 {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,


        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.


        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year= sc.nextInt();

        
       // int year= 2024;

        if ((year%4 == 0) && (year%100 != 0) || (year % 400==0))
        {
            System.out.println("Leap Year..");
        }
            else
        {
            System.out.println("Not a Leap year..");

        }
    }
}
