package Array;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input  by for loop
        System.out.println("Enter the number of elements : ");
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //output by for loop 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "");
        }
        sc.close();
    }
}
