package src.Oops.Jan4;

import java.util.Scanner;

public class Lab123 {
    public static void main(String[] args) {

        //SWAPPING two variable withOUT  3rd variable using Multipication and division

        //NOT WORK IF THR VALUE IS ZERO

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter  A : ");
        int  a =sc.nextInt();
        System.out.println("Enter  B : ");
        int  b =sc.nextInt();
        System.out.println();
        System.out.println( "Values of A "+a);
        System.out.println( "Values of B "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println();
        System.out.println("New value of A "+a);
        System.out.println("New value of B "+b);
    }

}
