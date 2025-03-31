package BitManipula;

public class bit_is_in_set {
    public static void main(String[] args) {
       long a= 0b10111001011;//give 0b for declaring it in binary value 
       int k=6;
       int masking=1<<k;//shofting by K
       long ans=a & masking;
       if( ans==0){
            System.out.println("Bit was off or not in set");
       }else
       {
        System.out.println("Bit is in the set");
       }
       

    }
}
