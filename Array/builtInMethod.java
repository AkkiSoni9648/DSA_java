package Array;
import java.util.Arrays;
public class builtInMethod {
    public static void main(String[] args) {
                int[] a={5,6,2,4,9,1,3,7,8};

                //For printing the each element of array by FOR loop

       /*
        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]+" ");

        } */

                //For printing the each element of array by FOR each loop

                for (int x:a) {
                    System.out.println(x);

                }

                //Sorting of Array
       /*
        Arrays.sort(a);

        System.out.println(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]+" ");

        }

        */
    }
}
