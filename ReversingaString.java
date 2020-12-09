public class ReversingaString {
    public static void main(String[] args) {
        String a = "Prakhar";
        char[] atochararray = a.toCharArray();

        for(int i = atochararray.length-1;i>=0;i--)
        {
            System.out.print(atochararray[i]);
        }
        
    }
    
}
