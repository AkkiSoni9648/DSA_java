package Loops;
import java.util.Scanner;
public class composite_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number n : ");
        int n = sc.nextInt();
        // composite num have factors other tha 1 and itself.
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                System.out.println("composite number ");
                break;
                //break key is used to break the loop
            }
        }

    }

}
