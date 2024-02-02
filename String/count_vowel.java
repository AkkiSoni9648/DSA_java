package String;

public class count_vowel {
    public static void main(String[] args) {
        String a ="abcdefghijklmnopqrst";
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            char ch =a.charAt(i);
            if(ch=='a'||ch=='e')
             count++;   
            
        }
        System.out.println(count);
    }
}
