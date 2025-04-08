package Method;

import java.util.Scanner;

public class fact{

    public static int factorial (int n) {
        if (n==0 || n==1){
return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);
        sc.close();
    }
}