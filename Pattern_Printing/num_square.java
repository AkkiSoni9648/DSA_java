package Pattern_Printing;

import java.util.Scanner;

public class num_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <=a; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
        sc.close();
    }
}
