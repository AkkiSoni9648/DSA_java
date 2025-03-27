package Array;

import java.util.Scanner;

import Loops.basic_of_loops;

public class sumoftwoelement {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter target value");
    int target =sc.nextInt();//target value (two sum)
    System.out.print("Enter the size of an araay");
    int n=sc.nextInt();//Array size
    int [] arr= new int [n];//Array making
    //input in array
    System.out.print("Enter the elements: ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
        
    }
    System.out.print("Elements of an array are: ");
    for (int i = 0; i < arr.length; i++) {   
    System.out.print(arr[i]+ " ");
    }

    boolean get=false;
    
    for (int i = 0; i < arr.length; i++) {
        for (int l = i+1; l <arr.length; l++) {
            if(arr[i]+arr[l]==target){
                System.out.println("Elmente found: "+arr[i]+"+"+arr[l]+"="+target);
                System.out.println(i+" "+l);
            get=true;
            }
        }

    }
}
}
