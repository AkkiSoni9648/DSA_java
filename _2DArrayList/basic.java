package _2DArrayList;

import java.util.ArrayList;

public class basic {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a=new ArrayList<>();
        ArrayList<ArrayList<Integer>> b=new ArrayList<>(3);

        // Blank ArrayList of size 5
        ArrayList<ArrayList<Integer>> v=new ArrayList<>(4);
        for (int i = 0; i <3; i++) {
           //we add an arraylist in arraylist v which is the size of 5
            v.add(new ArrayList<>(2));

        }


    }
}
