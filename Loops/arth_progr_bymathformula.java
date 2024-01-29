package Loops;

import java.util.Scanner;

public class arth_progr_bymathformula {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the n : ");
        int  n=sc.nextInt();
        //an=2n-1
        //1,3,5,7,9,.......
        for(int i=1;i<=2*n-1 ;i+=2){
            System.out.println(i);
        }
        sc.close();
    }
}
