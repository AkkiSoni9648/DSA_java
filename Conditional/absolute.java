package Conditional;
import java.util.Scanner;
public class absolute {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        if(n<0){
            System.out.println(-n);
        }else{
            System.out.println(n);
        }

        sc.close();

    }
}
//absolute means mod of that number that means always in positive value
