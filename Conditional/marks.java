package Conditional;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        if(n>=81) System.out.println("very good");
        else if (n>=61) System.out.println("good");
        else if (n>=41) System.out.println("average");
        else  System.out.println("fail39");

    }
}
