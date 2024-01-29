package Array;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        for(int x:arr){
            System.out.print(x);
        }
        System.out.println();
        //Reverse by for loop
       /*
        for (int i = 0; i <arr.length/2; i++) {
            int j =arr.length-1-i;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            */

        //Reverse by while loop
        int k =0,l=arr.length-1;
        while(k<=l){
            int tempp=arr[k];
            arr[k]=arr[l];
            arr[l]=tempp;
            k++;
            l--;
        }

        for(int c:arr){
            System.out.print(c+" ");
        }
        System.out.println();


    }
}
