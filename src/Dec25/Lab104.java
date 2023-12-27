package src.Dec25;

public class Lab104 {
    public static void main(String[] args) {

        int [] int_arr= {66,88,65,71,43};
        long[] lon_arr={56l,98l};
        float[] flt_arr={56.54f,98.12f};
        double[] dbl_arr={34.3,43.5,94.5};

        boolean[] b_arr={true,false};
        String [] s_arr={"sonam","pramod"};
        char[] char_arr={'a','s','f'};

        System.out.println(int_arr.length);
        System.out.println(s_arr.length);
        for (int i = 0; i < s_arr.length; i++) {
            System.out.println("Length is:"+s_arr[i]);

        }

    }
}
