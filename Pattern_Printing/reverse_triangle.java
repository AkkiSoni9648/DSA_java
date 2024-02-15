package Pattern_Printing;

import java.util.Scanner;

public class reverse_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int a = sc.nextInt();
        for (int i =1;i<=a;i++) {
            for (int j = 1; j <=a+1-i;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
sc.close();
        }
    }
}
