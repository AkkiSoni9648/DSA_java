package Conditional;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a = ");
        int a= sc.nextInt();
        System.out.println((a%2==0)?"Even":"Odd");
        //condtion? if true :if false
        sc.close();
    }
}
