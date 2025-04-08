package Method;

public class ispalindrome {

    public static boolean  ispalin(int n){

        int original=n;
        int rev=0;

        while(n>0){
        
        int digit=n%10;
        rev=rev*10+digit;
        n/=10;
    }
        return original==rev;

    }
    public static void main(String[] args) {

        int n =111;

        if(ispalin(n)){
            System.out.println(n+" is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
