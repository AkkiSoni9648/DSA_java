package Conditional;
import java.util.Scanner;
public class profit_loss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sp = ");
        int sp= sc.nextInt();
        System.out.println("Enter Cp = ");
        int cp= sc.nextInt();
        if (sp>cp) {
            System.out.println("Profit");
            System.out.println(sp-cp);
        }
        if (cp>sp) {
            System.out.println("Loss");
            System.out.println(cp-sp);
        }
        if (sp==cp) System.out.println("No profit No loss");


    }
}
