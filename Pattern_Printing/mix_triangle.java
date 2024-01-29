package Pattern_Printing;

import java.util.Scanner;

public class mix_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print((char) (i + 64) + " ");
            } else {
                System.out.println(i + " ");
                for (int j = 1; j <= i; j++) {
                    System.out.println(j + " ");
                }
            }
            System.out.println();

        }
    }
}
/*

public class PatternPrint {
    public static void main(String[] args) {
        int num = 1;
        char ch = 'A';

        for (int i = 1; i <= 6; i += 2) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        System.out.print(num + " ");
                        num++;
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            System.out.println();
        }
    }
}

 */