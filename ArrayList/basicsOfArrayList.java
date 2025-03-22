package ArrayList;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
        int[] arr = new int[10];
        ArrayList<Integer> al = new ArrayList<>(5);
        //initialise of ArrayList
        al.add(0, 10);
        al.add(1, 20);
        al.add(2, 30);
        al.add(3, 40);
        al.add(4, 50);
//heyyy

        System.out.println(al.get(0));
        System.out.println(al.get(1));

        //All the element without loop
        System.out.println(al);
        //we use size here for finding the length of AL
        //print all the element of ArrayList
        for (int i = 0; i <al.size(); i++) {
            System.out.println(al.get(i));
        }

        //update the element or modify the value in ArrayList
        al.set(2,25);
        System.out.println(al.get(2));

        //To add any element in Al
        //Adding in Al is known as Push Back
        al.add(60);
        System.out.println(); 
        for (int i = 0; i<al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
