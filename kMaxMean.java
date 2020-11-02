import java.util.Scanner;


import java.util.Arrays;
public class kMaxMean {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = obj.nextInt(); 
        }
        //Kth Smallest 
        System.out.print("Enter Kth");
        int k = obj.nextInt();
        Arrays.sort(arr);
        int ele = arr[k-1];
        System.out.println("The "+k+" smallest element is "+ele);
        //kth largest 
        System.out.print("Enter Kth");
        int kone = obj.nextInt();
        Arrays.sort(arr);
        int eleone = arr[n-k+1];
        System.out.println("The "+kone+" largest element is "+eleone);
        

    }
}
