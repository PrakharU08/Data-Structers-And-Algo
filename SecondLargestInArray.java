public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,5,76,45,34};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second = first;
                first = arr[i];
            }
            else if(arr[i] >second && arr[i]!=first)
                second = arr[i];
        }
        System.out.println(second);
    }
    
}
