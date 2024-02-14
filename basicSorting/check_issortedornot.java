package basicSorting;

public class check_issortedornot {
    public static void main(String[] args) {
        //sorting means arraning the data into decreasing or increasing order
        //there are mainly three types of sorting
        int[]a={1,3,2,5,8,9};
        int n=a.length;
        boolean flag=true;//true means sorted
        for (int i = 0; i < n-1; i++) {
            if(a[i]>a[i+1]){
                flag=false;//false means unsorted
                break;
            }
        }
            if(flag==true)System.out.println("Sorted");
            else System.out.println("unsorted");
        }
    }
