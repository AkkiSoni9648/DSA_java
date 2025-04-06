package BitManipula;

import java.util.Arrays;

public class singlenumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,1,2,3,4,5};
Arrays.sort(arr);
        int i=0;
        while(i<arr.length-1){
            if(arr[i]!=arr[i+1]){
                System.out.println(arr[i]);
                return;
            }
            i+=2;
        }
            
System.out.println(arr[i]);

    }
}
