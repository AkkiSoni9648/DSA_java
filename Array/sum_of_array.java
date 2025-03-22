package Array;

import java.util.Scanner;

public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            System.out.println(sum);//cumulative sum at each step.
        }
        System.out.println(sum);//total sum
    }

}
