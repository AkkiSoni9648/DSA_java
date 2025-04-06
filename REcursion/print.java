package REcursion;

public class print {
    public static void prin(int n){
        //BAse Condition (Stopping of a function )
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        prin(n+1);
        //System.out.println(n);
    }
    public static void main(String[] args) {
        prin(1);

    
    }
}
