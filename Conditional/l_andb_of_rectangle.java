package Conditional;
import java.util.Scanner;

public class l_andb_of_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length = ");
        int length= sc.nextInt();
        System.out.println("Enter Breadth = ");
        int breadth= sc.nextInt();
        int area=length*breadth;
        int peri =2*length+breadth;
        if (peri<area) {
            System.out.print(" Area is Greater than its perimeter");
        }else{
            System.out.println(" Area is Less than its perimeter");
        }
sc.close();
    }
}
