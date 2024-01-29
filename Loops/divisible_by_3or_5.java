package Loops;

public class divisible_by_3or_5 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%3==0 || i%5==0){
                System.out.println(i);
            }
        }
    }
}
