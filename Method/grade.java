package Method;

import java.util.Scanner;

public class grade {
    public static String grade(int n){

        if(n>=91 && n<=100){
            return "AA";
        }else if(n>=81){
            return"BB";
        }else if (n>=71){
            return"CC";
        }else if (n>=61){
            return"DD";
        }else if(n>=51){
            return "EE";
        }else{
            return "FAIL";
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the marks: ");
        int n=sc.nextInt();
        if(n<0 || n>100){
            System.out.print("Enter a Valid Marks between 0 to 100 only ");
        }else{
    String gra=grade(n);
    System.out.print("Your grade is: "+gra);
    }
}
}
