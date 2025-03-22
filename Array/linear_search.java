package Array;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Target ");// target which you want find
        int a=sc.nextInt();
        System.out.println("Enter size of an array :"); //declare size of an array
        int n= sc.nextInt();
        int[]arr=new int [n];//declare an array of size n
        System.out.println("Enter array elements :");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();//take input by user

        }
        //solution 
        for (int i = 0; i <n; i++) {
            if (arr[i]==a) {
        System.out.println("Found");
            }

        }



    }
}
