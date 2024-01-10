package src.Oops.Jan5;

public class Lab134 {
    public static void main(String[] args) {
    // Real time example of using Stringbuffer or Stringbuilder

        String pass = "Pass@321";

        // if 1000 times I need to change the value then which one to use??
        // obvioulsy either normal string ,SBuilder , SBuffer

        StringBuilder password2= new StringBuilder("Pass@321");
        password2.append("45");
        System.out.println(password2);


    }
}
