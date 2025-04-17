package String;

import java.util.Scanner;

public class totaldigit {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        String S=Integer.toString(a);
        System.out.println(S.length());
    }
}
