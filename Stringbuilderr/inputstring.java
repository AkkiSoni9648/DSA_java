package Stringbuilderr;

import java.util.Scanner;

public class inputstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String t=" ";
        for (int i = 0; i < A.length(); i++) {
            if(i%2==0){
                t+='a';

            }else{
                t+=A.charAt(i);
            }
        }
        System.out.println(t);
    }
}
