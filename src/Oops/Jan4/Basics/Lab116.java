package src.Oops.Jan4.Basics;

import java.util.Scanner;

public class Lab116 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your NAME : ");
        System.out.println(scanner.next());
    }
    public static void main(int a) {
        System.out.println("ANOTHER MAIN");
    }

    public static void main(int a, int b)
    {
        System.out.println("one more main");
    }

    public static int main(int a, int b, int c)
    {
        System.out.println("one more main");
        return 99;
    }
}
