import java.util.Scanner;
public class SortingWithoutAlgo {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] a = {0,1,1,0,1,2,1,2,1,0};
        int low = 0 ;
        int mid = 0 ;
        int high = a.length-1;
        int temp;
        while(mid<=high){

            if(a[mid] == 0){
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {
                mid++;
            }
            else if(a[mid]== 2)
            {
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
            
        }
        for(int i = 0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
        
    }
    
}
