package src.Oops.Jan5;

public class Lab136 {
    public static void main(String[] args) {

        // If something is Thread safe--> we avoid
        //StringBuilder vs Stringbuffer

        // with the help of Stringbuffer or builder we can reverse a program with just a single command.

//        StringBuilder sb= new StringBuilder("Sonam");
//        sb.reverse();
//        System.out.println(sb);

        StringBuffer sb= new StringBuffer("Kashyap");
        sb.reverse();
        System.out.println(sb);
    }

}
