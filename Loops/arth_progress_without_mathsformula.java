package Loops;

import java.util.Scanner;

public class arth_progress_without_mathsformula {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the n : ");
        int  n=sc.nextInt();
        //3,6,9,12,15,......
        int a =3;
        for(int i=1;i<=n ;i++) {
            System.out.println(a);
            a+=3;
        }
        sc.close();
    }
}
