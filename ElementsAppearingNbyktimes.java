import java.util.*;

public class ElementsAppearingNbyktimes
{
    public static void main(String args[])
    {   //If element appears more then n/2 elements
        /*
        int[] arr = {7,7,5,7,1,5,7,5,5,7,7,5,5,5,5};
        int count =0;
        int candidate = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(count ==0)
            {
                candidate =arr[i];
            }
            else if(arr[i]==candidate)
            {
                count++;
            }
            else
            count--;
        }
        System.out.println("The candidate which appear more then n/2 times is " +candidate);
        */
        //For more then n/3 
        int[] arr = {1,1,1,3,3,2,2,2};
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0 ;
        for(int num : arr)
        {
            if(num == num1 )
            {
                c1++;
            }
            else if(num==num2)
            {
                c2++;
            }
            else if(c1==0)
            {
            num1 = num;
            c1 = 1;
            }
            else if(c2==0)
            {
            num2 = num;
            c2 = 1;
            }
            else
            {
                c1--;
                c2--;
            }
        }
        //System.out.print(num1);
        //System.out.println(num2);
        List<Integer> ans = new ArrayList<Integer>();
        int count1 =0;
        int count2 =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]==num1)
            {
                count1++;
            }
            else if(arr[i] ==num2)
            {
                count2++;
            }
        }
        if(count1>arr.length/3)
        {
            ans.add(num1);
        }
        if(count2>arr.length/3)
        {
            ans.add(num2);
        }

        System.out.println(Arrays.toString(ans.toArray()));




    }
}