package _2DArray;

public class toAdd2Matrices {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m=a.length;
        int n=a[0].length;
        int [][]res =new int[m][n];
        //logic
        for (int i = 0; i <m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        //output
            for (int i = 0; i <m; i++) {
                for (int j = 0;j <n; j++) {
                    System.out.print(res[i][j]+" ");
                }

                System.out.println();
        }
    }
}
