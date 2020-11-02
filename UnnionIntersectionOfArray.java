public class UnnionIntersectionOfArray {
    public static void main(String args[])
    {
        int a[] = { 1, 2, 4, 5, 6 }; 
        int b[] = { 2, 3, 5, 7 }; 
        int m = a.length;
        int n = b.length;
        int i =0;
        int j=0;
        System.out.print("The Union of the arrays are:");
        while (i < m && j < n) { 
            if (a[i] < b[j]) 
                System.out.print(a[i++] + " "); 
            else if (b[j] < a[i]) 
                System.out.print(b[j++] + " "); 
            else { 
                System.out.print(b[j++] + " "); 
                i++; 
                } 
            } 
      
        /* Print remaining elements of  
        the larger array */
        while (i < m) 
            System.out.print(a[i++] + " "); 
        while (j < n) 
            System.out.print(b[j++] + " ");
        
        i=0;
        j=0;

        
        System.out.print("The Intersection of the arrays are:");
        while (i < m && j < n) { 
            if (a[i] < b[j]) 
                i++; 
            else if (b[j] < a[i]) 
                j++; 
            else { 
                System.out.print(b[j++] + " "); 
                i++; 
                } 
            }
          
    }
    
      
}
    

