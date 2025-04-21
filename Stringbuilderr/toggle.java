package Stringbuilderr;

public class toggle {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder("Hello");
        for (int i = 0; i < sc.length(); i++) {
            char c=sc.charAt(i);
            int ascii=(int)c;
            if(ascii>=65 && ascii<=90){
                ascii+=32;
                c=(char)ascii;
                sc.setCharAt(i, c);

            }
            else if(ascii>=97 && ascii<=122){
                ascii-=32;
                c=(char)ascii;
                sc.setCharAt(i, c);

            }
        }
        System.out.println(sc);

    }
}
//A=65   Z=90
// a=97   z=122
