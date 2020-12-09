public class SubsequenceOfaString {
    
    public static String[] subsequence(String s)
    {
        if(s.length()==0){
            String ans[] = {""};
            return ans;
        }

        String smallans[] = subsequence(s.substring(1));
        String finalans[] = new String[smallans.length*2];
        int k =0;
        for(int i =0;i<smallans.length;i++)
        {
            finalans[i] = smallans[i];
            k++;
        }
        for(int i=0;i<smallans.length;i++)
        {
            finalans[k] = s.charAt(0) + smallans[i];
            k++; 
        } 
        return finalans;
    }   
    public static void main(String args[])
    {
        System.out.println("The subsequence is as");
        String s = "xyz";
        String p[] = subsequence(s);
        for(int i=0;i<p.length;i++)
        {
            System.out.println(p[i]);
        }
    }
    
}
