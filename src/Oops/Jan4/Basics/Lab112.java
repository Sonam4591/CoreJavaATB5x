package src.Oops.Jan4.Basics;

public class Lab112 {
    public static void main(String[] args) {

        int c= add_1(); //no args
        int c1= add_1(5,9); // 2 args  //Definition of the function
        int c2= add_1(55); // 2 args
        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);


        sayhello(); // call to the function

        //        int a,b,c;
//        a=10;
//        b=20;
//        c=a+b;
//        System.out.println("Addition is : "+c);
//
//        a=54;
//        b=68;
//        int d =a+b;
//        System.out.println(c);
    }

  static int add_1(int a, int b)
    {
        return a+b;
    }
    static int add_1(int a)
    {
        return a+a;
    }

    static int add_1()
    {
        return 99;
    }

   static void sayhello()
    {
        System.out.println("hi...");
    }
}
