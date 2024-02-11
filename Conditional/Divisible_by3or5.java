package Conditional;
import java.util.Scanner;
public class Divisible_by3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if (a % 5 == 0 || a % 3 == 0)
            System.out.println("Divisible by 5 or 3 both ");
        else System.out.println("Not Divisible by 3 or 5");
        sc.close();
    }
}
