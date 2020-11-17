
public class CommonEleInSortedArray
{
    public static void main(String[] args) {
        
     
   
    int[] arr1 = {1,3,4,5,6,7,12};
    int[] arr2 = {7,12,18,20,36,70};
    int[] arr3 = {7,12,20,90};

    int x=0; 
    int y=0; 
    int z=0;
    while(x<arr1.length && y<arr2.length && z<arr3.length)
    {
        if(arr1[x]==arr2[y] && arr2[y]==arr2[z])
        {
            System.out.println(arr1[x]);
            x++;
            y++;
            z++;
        }
        else if(arr1[x]>arr2[y])
        {
            y++;
        }
        else if(arr2[y]>arr3[z])
        {
            z++;
        }
        else
        {
            x++;
        }
            
        }

    }
    

}
