package src.Oops.Jan4.Basics;

import java.util.Scanner;

public class Lab121 {
    public static void main(String[] args) {
  //SWAPPING two variable with 3rd variable

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  A : ");
       int  a =sc.nextInt();
        System.out.println("Enter  B : ");
        int  b =sc.nextInt();
        System.out.println();
        System.out.println( "Values of A "+a);
        System.out.println( "Values of B "+b);

        int temp=a;
        a=b;
        b=temp;
        System.out.println();
        System.out.println( "New A "+a);
        System.out.println( "New B "+b);

    }
}
