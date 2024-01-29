package _2DArrayList;
import java.util.*;
public class function {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<>();
        a.add(10);a.add(20);a.add(30);
        ArrayList<Integer> b= new ArrayList<>();
        b.add(40);b.add(50);b.add(60);
        ArrayList<Integer> d= new ArrayList<>();
        ArrayList<Integer> c= new ArrayList<>();
        c.add(70);c.add(80);
        ArrayList<ArrayList<Integer>> z= new ArrayList<>();
        z.add(a);z.add(b);z.add(c);z.add(d);

        //output of all element (Traverse of elements)
        for (int i = 0; i <z.size(); i++) {

            System.out.println(z.get(i));

        }
        //For a particular Element
        System.out.println(z.get(1).get(1));

    }
}
