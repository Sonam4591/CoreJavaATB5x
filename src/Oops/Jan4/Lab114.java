package src.Oops.Jan4;

public class Lab114 {
    public static void main(String[] args) {
        /*
        Create a Function :

        1. Access Modifier
        2. Data type
        3. Name of the function
        4. Arguments/parameters
        5. Return type
         */

        float d=   sum(45.5f,59.8f);
        System.out.println(d);

    }
    public static float sum(float sonam, float nuri)
    {
        return sonam*nuri;
       // System.out.println();   Not possible only return should be the last statement.
    }

}
