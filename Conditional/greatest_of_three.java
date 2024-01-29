package Conditional;

import java.util.Scanner;

public class greatest_of_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        int a= sc.nextInt();
        System.out.println("Enter b = ");
        int b= sc.nextInt();
        System.out.println("Enter c = ");
        int c = sc.nextInt();
    if (a>=b && a>=c) System.out.println(a+" is greatest");
    else if (b>=c && b>=a) System.out.println(b+" is greatest");
    else System.out.println(c+" is greatest");
    }

}
