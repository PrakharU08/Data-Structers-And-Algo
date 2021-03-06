import java.util.*;
public class AggressiveCow {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numofstalls = sc.nextInt();
        int numofcow = sc.nextInt();
        int arr[] = new int[numofstalls];
        for(int i =0 ;i<numofstalls;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int lb = 1;
        double ub = 1e9;
        int ans = 0;
        while(lb<=ub)
        {
            int mid = (lb + (int)ub)/2;
            int cow = 1;
            int prev = arr[0];
            for(int i=1;i<numofstalls;i++)
            {
                if(arr[i]-prev>=mid)
                {
                    cow++;
                    prev = arr[i];
                }
                if(cow==numofcow) break;
            }
            if(cow==numofcow)
            {
                ans = mid;
                lb = mid+1;
            }
            else
            {
                ub = mid-1;
            }
        }
        System.out.println(ans);
    }
}
