package Method;

import java.util.Scanner;

public class sum_of_two_number {
    public static  int  sum(int n,int m){
        int add=n+m;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n=sc.nextInt();
        System.out.print("Enter number 2: ");
        int m=sc.nextInt();
        int add=sum(n, m);
        System.out.println("Addition of two numbers are: "+add);
    }
}
