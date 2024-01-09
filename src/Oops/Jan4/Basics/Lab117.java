package src.Oops.Jan4.Basics;

public class Lab117 {
    public static void main(String[] ref_name) {
        System.out.println("Run Fine..");
        main("sonam");
      int d= main(5);
        System.out.println(d);


    }
   static void main(String a)
    {
        System.out.println("I m another Main but JVM doesnot recognise me");
    }

   static   int main(int a)
    {
        return a+10;  //It will simply add +10 into "a"
    }
}
