package src.Oops.Jan5;

public class Lab131 {
    public static void main(String[] args) {

        //String Immutability : Original Strings always remain unchanged.

        String str = "Sonam";  // created in String constant pool
        System.out.println(str.concat("Kashyap"));
        System.out.println(str); //Immutability

        System.out.println(str.contains("n")); // if it contains the value true otherwise false

        String str2 = new String("kash");  // (Object area) is only cretaed when type "NEW"


        String expected_res="password@321";
        String actual_res="Password@321";
        if (expected_res.equalsIgnoreCase(actual_res))  // ignore the case sensitivity

      // if (expected_res.equals(actual_res))
           System.out.println(true);
      // else
        //   System.out.println(false);
    }
}
