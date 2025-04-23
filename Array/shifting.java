package Array;

public class shifting {
    public static void main(String[] args) {
        int[] oldArr = {10, 20, 30, 40, 50};
        int[] newArr = new int[oldArr.length + 1];

        newArr[0] = 99;  

        for (int i = 0; i < oldArr.length; i++) {
            newArr[i + 1] = oldArr[i];
        }

        System.out.println(java.util.Arrays.toString(newArr));  // [99, 10, 20, 30, 40, 50]
    }
}

