//Incomplete  :- deep array, shallow array
package Array;

import java.util.Arrays;

public class copyofarray {
    public static void main(String[] args) {
        int a[] ={30,10,40,23,89,34};

        //For each loop
         
        for(int x:a){
            System.out.print(x+" ");
        }
        System.out.println();



         int []b=a;  //Shallow Copy
        for(int y:b){
            System.out.print(y+" ");
        }
        System.out.println();


        //Deep Copy method 1
        int [] c= Arrays.copyOf(a,a.length);
        for(int z:c){
            System.out.print(z+" ");
        }

        //Deep Copy method 2

    }
}
