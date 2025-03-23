package REcursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n==1 || n==0) return 1;
       return n=n*fact(n-1);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();

        System.out.println(fact(n));
    }
}
