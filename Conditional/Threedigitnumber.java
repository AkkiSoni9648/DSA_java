package Conditional;
import java.util.Scanner;
public class Threedigitnumber {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=Sc.nextInt();
        if (n>99 && n<1000)
            System.out.println("yes it is three digit number");
        else System.out.println("Not a three digit number ");
        sc.close();
    }
}
