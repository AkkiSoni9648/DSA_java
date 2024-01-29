package Loops;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = sc.nextInt();
        int x=0;
        // composite num have factors other tha 1 and itself.
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite number ");
                x=1;
                break;
                //break key is used to break the loop
            }
        }if(x==0){
            System.out.println("prime number ");
        }
    }
}
