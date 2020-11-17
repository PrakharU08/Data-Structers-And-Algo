public class BuyandSellStock {
    public static void main(String[] args) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        int[] arr = {7,1,5,3,6,4};
        for(int i =0;i<arr.length;i++)
        {
            if(minprice>arr[i])
            {
                minprice = arr[i];
            }
            else if(arr[i]-minprice>maxprofit)
            {
                maxprofit = arr[i]-minprice;
            }
        }
        System.out.print(maxprofit);


    }
    
}
