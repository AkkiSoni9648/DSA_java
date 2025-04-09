package Method;

import java.util.*;

public class primr_or_not {

    public static boolean isPrime(int n ){
        if (n<=1)
        return false;
        for (int i = 2; i < n; i++) {
            if(n%i==0)
            return false;
        }
        return true;
    }
public static void main(String[] args) {
  //isPrime(10);
    System.out.println(isPrime(7));
    System.out.println(isPrime(10));
}

}
