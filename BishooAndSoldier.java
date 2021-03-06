import java.util.Arrays;
import java.util.Scanner;

public class BishooAndSoldier {
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        Arrays.sort(arr);
        while(q-->0)
        {
            int i =0;int count =0;
            int sum =0;
            int power = sc.nextInt();
            try {
                while(arr[i]<=power && i<=arr.length-1)
                {
                    count++;
                    System.out.println("i="+i );
                    sum = sum+arr[i];
                    i++;
                } 
               
            }catch(ArrayIndexOutOfBoundsException e) {
                
            }

            System.out.println(count+" "+sum);
        }

        
    }
    
}
/*7
1 2 3 4 5 6 7
3
3
10
2

3 6
7 28
2 
*/