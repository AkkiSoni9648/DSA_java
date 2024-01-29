package Array;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Target ");
        int a=sc.nextInt();
        System.out.println("Enter size of an array :");
        int n= sc.nextInt();
        int[]arr=new int [n];
        System.out.println("Enter array elements :");
        for (int i = 0; i <n; i++) {
            arr[i]=sc.nextInt();

        }
        boolean flag=false;
        for (int i = 0; i <n; i++) {
            if (arr[i]==a) {
                flag=true;
                break;
            }

        }

if(flag==true) System.out.println("found");
else System.out.println("not found");


    }
}
