package src.Oops.Jan5;

import java.util.Scanner;

public class Lab138 {


    public static void main(String[] args) {

//    String s1 = "sonam";
//    StringBuilder sb= new StringBuilder("sonam");
//    String s3= sb.toString();  // In order to convert StringBuilder to String back we need to use a function toString();

        // To find a String is Palindrome or not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to find our is palindrome or not");
        String org_value = sc.next();
       boolean res = IsPalindrome(org_value);
       if (res){
           System.out.println("Palindrome");
       }
       else{
           System.out.println("Not a Palindrome");
       }
    }

     static boolean IsPalindrome(String orgValue) {
        String orgstr=orgValue;
        StringBuilder sb = new StringBuilder(orgValue);
            sb.reverse();
            return orgstr.equalsIgnoreCase(sb.toString());
    }
}
