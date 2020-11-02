import java.util.Scanner;
class ReverseArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = obj.nextInt(); 
        }
        for (int i =n-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

    }
}