import java.util.Scanner;
public class MinMaxArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt(); 
        }
        int lar = arr[0];
        for (int i =0;i<n;i++){
            if(arr[i]>lar){
                lar = arr[i];
            }
        }
        System.out.println("Largest = "+lar);
        
        int small = arr[0];
        for (int i =0;i<n;i++){
            if(small>arr[i]){
                small = arr[i];
            }
        }
        System.out.println("Smallest = "+small);
 


    }
    
}
