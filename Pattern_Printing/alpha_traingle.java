package Pattern_Printing;

import java.util.Scanner;

public class alpha_traingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();

        }
    }
}
