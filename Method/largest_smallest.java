package Method;

import java.util.Scanner;

import _2DArray.largestElemin2DAraay;

public class largest_smallest {

    public static int Largest(int first, int second, int third){
        int max=first;
        if(second>max){
            max= second;
        }
        if (third>max){
            max= third;
        }
        return max;
    }
    public static int smallest(int first,int second,int third){

        int min=first;
        if(second<min){
        min=second;
        }
        if(third<min){
            min = third;
        }
        return min;
    }



    public static void main(String[] args) {
        //syntax of method
        Scanner sc=new Scanner(System.in);

        System.out.println("WELCOME TO THE GREATEST AND SMALLEST QUESTION : ");

        System.out.print("Enter the first number: ");
        int first =sc.nextInt();

        System.out.print("Enter the second number: ");
        int second =sc.nextInt(); 
        
        System.out.print("Enter the third number: ");
        int third =sc.nextInt();

        int max=Largest(first, second, third);
        int min=smallest(first, second, third);

System.out.println("Laggest number is : "+max);
System.out.println("Smallest number is : "+min);


    }
    
}
