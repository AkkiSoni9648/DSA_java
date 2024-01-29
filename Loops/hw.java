package Loops;

public class hw {
    public static void main(String[] args) {
        int x = 4, y = 0;
        while ( x >= 0 ) {
            x-- ;
            y++ ;
            if ( x == y )
                continue ;
            else
                System.out.println(x+""+y);
        }
        }

}
/*

Initial values: x = 4, y = 0
Iteration 1: x = 3, y = 1. The condition x == y is false, so it prints 31.
Iteration 2: x = 2, y = 2. The condition x == y is true, so it uses continue and skips printing for this iteration.
Iteration 3: x = 1, y = 3. The condition x == y is false, so it prints 13.
Iteration 4: x = 0, y = 4. The condition x == y is false, so it prints 04.
Iteration 5: x = -1, y = 5. The condition x == y is false, so it prints -15.

*/
