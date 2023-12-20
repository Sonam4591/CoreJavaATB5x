package src.Dec25;

public class Lab98 {
    public static void main(String[] args) {

        //Arrays--> Java
        //Collection of similar data types
        //if names then only names if numbers then only number

        int a =10;  //Store the value of 10 into "a"

        int marks_10[]= {10,20,30,40,50};  // integer type of container// same data types int

        //int marks_11[]={true,10,20,30};  //not possible since "boolean" data type //not same
       // int marks_12[]={10,90.20f,20,30};  //not possible since "float" data type //not same

        String[] items={"Milk","Bread","Butter","Candies","coke"};

        System.out.println(items[0]);
        System.out.println(items.length);  // total number of items
        System.out.println(items[3]); //always fetch items number with reference number which starts from 0

        //System.out.println(items[5]); // Exception in Thread      since reference number doesnot exist

        //index--> 0 to 4
        //length -->1 to 5







    }
}
