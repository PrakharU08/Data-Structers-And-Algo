import java.util.*;
public class SumOfNoTwoAdjEle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,5,10,100,10,5};

        int inc = arr[0];
        int exc = 0;


        for(int i =1;i<arr.length;i++)
        {
            int ninc = exc+arr[i];
            int nexc = Math.max(inc, exc);

            inc = ninc;
            exc = nexc;
        }
        int ans = Math.max(inc,exc);
        System.out.println(ans);
    }
    //{5,5,10,100,10,5}
    
}
