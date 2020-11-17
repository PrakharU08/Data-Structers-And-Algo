public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int a = 8;
        int count =0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=1;j<arr.length-1;j++)
            {
                if(arr[i]+arr[j] == a)
                {
                    count++;
                }
            }
        }
        
    }
    
}
