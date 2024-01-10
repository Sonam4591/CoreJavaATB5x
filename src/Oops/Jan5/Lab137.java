package src.Oops.Jan5;

import java.util.Scanner;

public class Lab137 {
    public static void main(String[] args) {

        // To find a String is Palindrome or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find our is palindrome or not");
        String org_value = sc.next();

        StringBuffer sb= new StringBuffer(org_value);
        StringBuffer  rev=sb.reverse();
       if (org_value.equalsIgnoreCase(rev.toString()))
           System.out.println("Is Palindrome");
       else
           System.out.println("Not a Palindrome");
    }

}
