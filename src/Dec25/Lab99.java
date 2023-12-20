package src.Dec25;

public class Lab99 {
    public static void main(String[] args) {

        //ways to create an array

        int marks[]={12,62,83,74,35};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        // another way
        int a[]=new int[4];  // 4 is length
        //a--> [0,0,0,0] -- default value of int -->0
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);

        a[0]=78;
        System.out.println(a[0]);
        a[1]=8;
        System.out.println(a[1]);
        a[0]=98; // you can reassign the value , previous one will be deleted
        System.out.println(a[0]);

      //  System.out.println(a[5]);   // ArrayIndexOutOfBoundsException

       final int b[]=new int[4];// only LENGTH will be final that is 4, value can be changed anytime

        System.out.println(b[0]);

        b[0]=65;

        b[1]=65;
        b[2]=65;
        b[3]=65;
       // b[4]=65;

        System.out.println(b[0]);   // values can be changed in array

        System.out.println(b.length);

    }
}
