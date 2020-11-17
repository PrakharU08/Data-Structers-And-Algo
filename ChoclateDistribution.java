public class ChoclateDistribution {
    public static void main(String args[])
    {
        int[] arr = {1,0,3,5,2};
        int[] candies = new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            candies[i] = 1;
        }
        //For traversing towards left end 
        for(int i =1;i<arr.length;i++)
        {
            if(arr[i]>arr[i-1])
            {
                candies[i] = candies[i-1]+1;
            }
        }
        //Traversing from Last element to right and checking the max
        for(int i = arr.length-2;i>=0; i--)
        {
            if(arr[i]>arr[i+1])
            {
                candies[i] = Math.max(candies[i+1]+1,candies[i]);
            }
        }
        int sum =0;
        //Sum of the candies
        for(int i=0; i<arr.length;i++)
        {
            sum = sum + candies[i];
        }
        System.out.println(sum);
    }
    
}
