public class Majorityelement
{
    public static void printmajority(int[] arr)
    {
        //Find Candidate for majority element
        int cand = candidate(arr);
        if (isMajority(arr,cand))
            System.out.println(" " + cand + " ");
        else
            System.out.println("No Majority Element");
    }
    public static int candidate(int[] arr)
    {
        int ele = 0;int count =0;
        int i =0;
        for(i=1;i<arr.length;i++)
        {
            if(count == 0)
            {
                ele = arr[i];
            }
            if(ele == arr[i])
            {
                count++;
            }
            else
                count--;
        }
        
        return ele;
    }

    public static boolean isMajority(int[] arr,int ele)
    {
        int i, count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == ele)
                count++;
        }
        if (count > arr.length/2)
            return true;
        else
            return false;
    }
    
    
    public static void main(String args[])
    {
        int arr[] = {3,3,3,4,5};
        printmajority(arr);
    }
}