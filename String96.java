import java.util.*;
public class String96 {
    public static void main(String args[])
    {
        String seq= "ABBAJJJKZKZ";
        char[] ap=seq.toCharArray();
        for(int i=0;i<seq.length();i++)
        {   
            int ind = ap[i] - 'A';
            System.out.print(ind + " ");
        }
        

    }
}
