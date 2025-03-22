package Array;
import java.util.Arrays;


public class basicsyntax {
    public static void main(String[] args) {
        int [] arr=new int [5];
        arr[0]=100;
        arr[1]=90;
        arr[2]=80;
        arr[3]=70;
        arr[4]=1;
System.out.println(arr);//give memory adress in hexa
System.out.println(Arrays.toString(arr));// give output (0,0,0,0,0)
System.out.println(arr[0]);//give value of arr [0]
// by loop print the araay 
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]+" ");
}
    }
}
