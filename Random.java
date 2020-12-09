import java.util.*;
public class Random { 
    public static void main(String args[])
    {
        Map<Character,Integer> ma = new HashMap<>();
        ma.put('a',2);
        ma.put('b',3);
        ma.put('c',4);
        int j=0;
        int count =0;
        String st = "abcba";
        int m =ma.get(st.charAt(j));
        if(m==1) m++;
        System.out.print(ma);
        /*
        int arr[] = {22, 32222222, 242, 277, 222};
        int k=2;
        int max = 0;
        for(int i=0;i<arr.length;i++)
        {
            int count =0;
            int b=arr[i];
            while(b!=0)
            {
                int num = b%10;
                if(num == k)
                {
                    count++;
                    max = Integer.max(count, max);
                }
                b = b/10;
            }
        }
        System.out.print(max +" ");
        */

       
       
       
        //alternate number from back 2560 = 62
        /*
        int num = 23896789;
        int count =0;
        int reversed = 0;
        int[] arr = new int[10];
        int i =0;
        while(num != 0) {
            int temp = num%10;
            num = num/10;
            arr[i] = temp;
            i++;
        }
        for(int p=0;p<arr.length;p = p+2)
        {
            System.out.println(arr[p]);
        }    
        */









        //Even number at even index and odd number at odd index


        /*

        int arr[] = {3, 6, 12, 1, 5, 8};
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                if(arr[i]%2!=0)
                {
                    for(int j = i;j< arr.length;j++)
                    {
                        if(arr[j]%2==0)
                        {
                            int temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;

                        }
                    }
                }
            }


        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        //Another Soluion of above problem
        /*
        { 
    int oddInd = 1; 
    int evenInd = 0; 
    while (true) 
    { 
        while (evenInd < n && arr[evenInd] % 2 == 0) 
            evenInd += 2; 
              
        while (oddInd < n && arr[oddInd] % 2 == 1) 
            oddInd += 2; 
              
        if (evenInd < n && oddInd < n) 
            { 
                int temp = arr[evenInd]; 
                arr[evenInd] = arr[oddInd]; 
                arr[oddInd] = temp; 
            } 
              
        else
            break; 
        } 
    } 
        */
       
       










        //Coins Ladder
        /* int n =8;
        int count = 1;
        while(n>0)
        {
            n = n-count;
            if(n<0)
            {
                break;
            }
            count++;
        }
        System.out.println(count-1);
        */
    }
}
