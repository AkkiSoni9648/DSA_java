package _2DArray;

public class transposeOfArray {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2},{3,4,5},{6,7,8}};
        int m =arr.length;
        int n=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
