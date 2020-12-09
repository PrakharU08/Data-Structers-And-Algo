public class StringPallindrom {
    public static void main(String args[])
    {
        String a = "cacacaaa";
        char[] atochararray = a.toCharArray();
        String rev = "";
        for(int i = atochararray.length-1;i>=0;i--)
        {
            rev = rev+(atochararray[i]);
        }
        System.out.println(rev);
        if(a.equalsIgnoreCase(rev))
        {
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
    
}
