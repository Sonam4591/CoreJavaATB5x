package src.Oops.Jan4;

public class Lab113 {
    public static void main(String[] args) {
        // What is Function --> can do some task --> you can give a task to someone else who can do it for you.

        //How to create a Function?
        //1. Definition
        //2. Call the Function

        //Function vs Method (is different in Oops)


     sayhello4times(); //Call the Function
     sayhello4times();

    double d= Math.pow(5,6);  //pre build funvtiom
        System.out.println(d);

    }
  //  accessModifier returnType methodName(parameterList) {
//        // method body
//    }

    static void sayhello4times()  // Definition
    {
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello");

        }
    }
}
