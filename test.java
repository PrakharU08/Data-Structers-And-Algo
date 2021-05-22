public class test {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,1,0,1,0,1,1,0,1,1,0,1};
        int count =0;
        for(int i = 1;i<arr.length;i++)
        {
            int j = i-1; int k = i+1;
            if(k<arr.length)
            {
                if(arr[j] == 0 && arr[k] == 0 && arr[i]==1)
                {
                    count++;
                    System.out.println(i);
                }
                
            }
        }
        System.out.println(count);
    }
}
