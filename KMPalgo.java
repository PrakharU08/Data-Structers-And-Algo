public class KMPalgo {
    
    public static void kmpsearch(String txt,String pat)
    {
        int m = txt.length();
        int n = pat.length();
        // create lps[] that will hold the longest 
        // prefix suffix values for pattern 
        int lps[] = new int[n];
        computeLPSarray(pat,n,lps);
        int i =0; int j=0;
        while(i<m)
        {
            if (pat.charAt(j) == txt.charAt(i)) { 
                j++; 
                i++; 
            } 
            if (j == n) { 
                System.out.println("Found pattern "
                                   + "at index " + (i - j)); 
                j = lps[j - 1]; 
            } 
  
            // mismatch after j matches 
            else if (i < m && pat.charAt(j) != txt.charAt(i)) { 
                // Do not match lps[0..lps[j-1]] characters, 
                // they will match anyway 
                if (j != 0) 
                    j = lps[j - 1]; 
                else
                    i = i + 1; 
            } 
        }


    }
    public static void computeLPSarray(String pat,int n,int[] lps)
    {
        int len =0;
        int i = 1;
        lps[0] = 0;
        while(i<n)
        {
            if(pat.charAt(i) == pat.charAt(len))
            {
                len ++;
                lps[i] = len;
                i++;
                
            }
            else
            {
                if (len != 0) { 
                    len = lps[len - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            }
        }
    }


    
    public static void main (String args[])
    {
        String txt = "ABABDABACDABABCABAB"; 
        String pat = "BACD";
        kmpsearch(txt,pat); 

    }
    
}
