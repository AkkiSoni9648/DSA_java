package Loops;

import java.util.Scanner;

public class geo_progression_bymethod2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the n : ");
        int  n=sc.nextInt();
        //3,6,12,24,48......
       /* int a =3;
        for(int i=1;i<=n ;i++) {
            System.out.println(a);
            a *= 2;

        */
        int a =3;
        for(int i=1;i<=n ;i++) {
            System.out.println(a);
            a *= 4;
        }
    }
}
