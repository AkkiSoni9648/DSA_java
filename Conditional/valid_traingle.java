package Conditional;

import java.util.Scanner;

public class valid_traingle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter L1 = ");
        int l1= sc.nextInt();
        System.out.println("Enter L2 = ");
        int l2= sc.nextInt();
        System.out.println("Enter L3 = ");
        int l3= sc.nextInt();
        if(l1+l2>l3 && l2+l3>l1 && l3+l1>l2)
            System.out.println("Valid Traingle");
        else System.out.println("Not Valid");
        sc.close();
    }
}
