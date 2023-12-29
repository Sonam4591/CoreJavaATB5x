package src.Dec25;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {

      //   Entering number Using normal Scanner Class

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number..");
//        int a=sc.nextInt();

        //Take input User marks of 5 subs and print the marks
        Scanner sc = new Scanner(System.in);
        float [] marks= new float[5];
        System.out.println("Enter the first subject ");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the Second subject ");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the Third subject ");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the Forth subject ");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the Fifth subject ");
        marks[4]=sc.nextFloat();

        for (int i = 0; i < marks.length; i++) {
            if(marks[i]<30)
                System.out.println("You are Failed in thi sub "+marks[i]);
            System.out.println(marks[i]);

        }
        sc.close();

    }

}
