package String;

public class insert_del {
    public static void main(String[] args) {
        StringBuilder a=new StringBuilder("Akash");
        a.deleteCharAt(2);
        a.insert(1,'z');
        System.out.println(a);
    }
}
