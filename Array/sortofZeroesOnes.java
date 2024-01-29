package Array;

public class sortofZeroesOnes {
    public static void main(String[] args) {
        int []arr={1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        int n =arr.length;
        int n00=0,noz=0;
        for (int i = 0; i <n; i++) {
            if(arr[i]==0) noz++;
            else n00++;
        }
        for (int i = 0; i <noz; i++) {
            arr[i]=0;
        }
        for (int i =noz; i <n00; i++) {
            arr[i] = 1;

        }
    }
}
