package src.Oops.Jan5;

public class Lab133 {
    public static void main(String[] args) {

        // 4 Ways to Create  Strings

         // First 2 are Immutable in nature --> That can't be changed.

        String s1 = "Sonam";
        String s2= new String("Soanm");

        // Mutable in nature --> That can be changed

        StringBuilder s3= new StringBuilder("Hello");
        s3.append(" Nuri");  // Values changed in original string
        System.out.println(s3);

        StringBuffer s4= new StringBuffer("Sonam");
        s4.append(" World");    // Values changed in original string
        System.out.println(s4);

    }
}
