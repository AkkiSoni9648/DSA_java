package _2DArray;

public class largestElemin2DAraay {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2},{3,4,5}};
        int m = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m=Math.max(m,arr[i][j]);
            }
            }
        System.out.println(m);
        }
    }

