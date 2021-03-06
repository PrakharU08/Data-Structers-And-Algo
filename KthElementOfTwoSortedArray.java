import java.util.Arrays;

public class KthElementOfTwoSortedArray {
    
    
    public static void main (String args[])
    {
        int arr1[] = {11,13 ,30 ,37, 47, 57, 63, 68};
        int arr2[] = {3, 3, 6, 8,10, 10, 18, 24, 37, 41, 42, 46, 48, 48, 53 ,54 ,54, 55, 57, 66, 66, 67, 69, 72, 81, 88,92, 93, 95, 95, 100};
        int k = 32;
        int j =0;

        for(int i =0;i<arr1.length;i++)
        {
            if(arr1[i]>arr2[j])
            {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                Arrays.sort(arr2);

            }
        }
        
        if(k>arr1.length)
        {
            k = k-arr1.length-1;
            System.out.println(arr2[k]);
        }
        else
            System.out.println(+arr1[k-1]);
    
    for(int i =0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ");
    System.out.println();
    for(int i =0;i<arr2.length;i++)
        System.out.print(arr2[i]+" ");
    
    
    }    
}
/*
8 31 32
11 13 30 37 47 57 63 68
3 3 6 8 10 10 18 24 37 41 42 46 48 48 53 54 54 55 57 66 66 67 69 72 81 88 92 93 95 95 10

*/
