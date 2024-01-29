package Array;

public class max_value {
    public static void main(String[] args) {
        int[] arr={10,8,43,12,5,67,43};
        int max=arr[0];
        for(int i =1;i<=arr.length-1;i++){
                        if(arr[i]>max) {
                            max = arr[i];
                        }
        }
        System.out.println(max);
    }
}
