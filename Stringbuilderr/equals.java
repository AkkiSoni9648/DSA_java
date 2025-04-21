package Stringbuilderr;

public class equals {
    public static void main(String[] args) {
        String str1="Akash";
        String str2="Akash";
        System.out.println(str1==str2);//both are same not they are equal.
        
        String str3="Akash";
        String str4="Aka";
        str4=str4+"sh";
        System.out.println(str3==str4);//give false beacuse it check only one thing.
        System.out.println(str3.equals(str4));//here it compare by each words.
    }
}
