package _2DArray;

public class rotateby90 {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2},{3,4,5},{6,7,8}};
        int m =arr.length;
        int n=arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                System.out.println(arr[j][i]);
            }
        }
        //rotate
        for (int i = 0; i <m; i++) {
            int a=0,b=m-1;
            while(a<=b){
                int te=arr[i][a];
                arr[i][a]=arr[i][b];
                arr[i][b]=te;
                a++;
            }
        }
    }

}
