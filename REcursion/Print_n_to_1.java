package REcursion;

public class Print_n_to_1 {
    public static int dec(int n){
    if(n>0){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return  dec(n-1);
    }else{
        if(n==1 || n==0){
            return n;
        }
        System.out.println(n);
        return dec(n+1);
    }
    }
    public static void main(String[] args) {
        System.out.print(dec(5));
        
    }
}
