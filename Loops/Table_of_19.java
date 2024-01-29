package Loops;

public class Table_of_19 {
    public static void main(String[] args) {
        for(int i=19;i<=190;i++){
            if(i%19==0){
                System.out.println(i);
            }
        }
    }
}
//Best Code
/*

for(int i=19;i<=190;i+=19){
        System.out.println(i);
        }

        */