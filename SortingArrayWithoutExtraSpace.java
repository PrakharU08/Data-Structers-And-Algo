import java.util.*;
public class SortingArrayWithoutExtraSpace{
    public static void main(String args[])
    {
        int[] arr ={5,6,7,8,9};
        int[] arr2 = {1,2,3};
       /* int[] b = new int[arr.length+arr2.length];
        int flag =0;
        for(int i =0;i<arr.length;i++)
        {
            b[i] = arr[i];
            flag++;
             
        }
        for(int i =0;i<arr2.length;i++)
        {
            b[flag] = arr2[i];
            flag++;    
        }
        Arrays.sort(b);
        flag = 0;
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = b[i];
            flag++;
        }
        for(int i =0;i<arr2.length;i++)
        {
            arr2[i] = b[flag];
            flag++;     
        }


        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i =0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");   
        }
        */
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>arr2[0])

            {
                int temp = arr[i];
                arr[i] = arr2[0];
                arr2[0] = temp;

                Arrays.sort(arr2);
            }
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i =0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+" ");   
        }
    }
}