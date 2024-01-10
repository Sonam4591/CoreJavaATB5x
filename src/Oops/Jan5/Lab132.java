package src.Oops.Jan5;

public class Lab132 {
    public static void main(String[] args) {

        /*  1.  == operator checks if two string references point to the same memory location.
            2.  equals method compares the actual content of the strings, checking if they contain the same
                sequence of characters.  */

        String s1= "Sonam";
        String s2= new String("Sonam");
        System.out.println(s1==s2);  // why false??
         // since s1 is created in (String Constant Pool) and s2 using new operator created in Object Area
        System.out.println(s1.equals(s2)); // TRUE  --> since content is equal

        String s3= new String("Sonam");
        System.out.println(s1==s3); // False case insensitivity
        System.out.println(s1.equalsIgnoreCase(s3)); //


    }
}
