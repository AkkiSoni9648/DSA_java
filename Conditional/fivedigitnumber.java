package Conditional;

import java.util.Scanner;
//hello
public class fivedigitnumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        if (n>=10000 && n<=99999)
            System.out.println("yes it is five digit number");
        else System.out.println("Not a five digit number ");
        Sc.close();
    }
    }


