package Method;

public class area_and_perimeter {

    public static double area(int r){
double areaa =Math.PI*r*r;
return areaa;
    }

public static double circum(int s){
double circum=Math.PI*2*s;
return circum;

    }
    public static void main(String[] args) {
        int r=2;
        int s=4;
        System.out.println(area(r));
        System.out.println(circum(s));
    }
}
