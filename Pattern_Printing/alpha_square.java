package Pattern_Printing;

import java.util.Scanner;

public class alpha_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alpha :");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();

        }
    }
}
/*

A=65
Z=90
a=97
z=122
0=48
1=49
9=57


 */
