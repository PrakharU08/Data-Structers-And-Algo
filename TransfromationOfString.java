public class TransfromationOfString {
    public static void main(String args[])
    {
        String str1 = "ABD";
        String str2 = "BAD";

        if(str1.length()!= str2.length())
            System.out.println("Length not same");
        int count[] = new int[256];
        for(int i =0;i<str1.length();i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i =0;i<256;i++)
        {
            if(count[i]!=0)
                System.out.println("Invalid String");
        }
        
        int i = str1.length()-1;
        int j = str2.length()-1;
        int result = 0;
        while(i>=0)
        {
            if(str1.charAt(i)!=str2.charAt(j))
                result++;
            else
                j--;
            i--;
        }
        System.out.print(result);



    }
    
}
