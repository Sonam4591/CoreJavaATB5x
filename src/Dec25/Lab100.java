package src.Dec25;

public class Lab100
{
    public static void main(String[] args) {

        int arr1[]={12,62,83,74,35};
        int arr2[]={12,62,83,74,35};
        System.out.println(arr1==arr2);

        int arr3[] =arr1;
        System.out.println(arr3==arr1);

        System.out.println(arr1.equals(arr2));
        //If String --> true why -- values
        //Arrays--> don't compare values --> only references compare which are not equal
        arr3[0]=24;
        System.out.println("Array 1 valu:"+arr1[0]);
        System.out.println("Array 3 valu:"+arr3[0]);


    }
}
