public class LLPallindrom{
    public static void main(String[] args) {
        LL1 obj = new LL1();
        obj.insert(1);
        obj.insert(6);
        obj.insert(4);
        obj.insert(6);
        obj.insert(1);
        Node temp = LL1.head;
        String abc = "";
        while(temp!=null)
        {
            abc = abc + temp.data;
            temp = temp.next;
        }
        String xyz = "";
        for(int i =abc.length()-1 ;i>=0 ;i--)
        {
            char a = abc.charAt(i);
            xyz = xyz+a;
        }
        if(abc.equals(xyz))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("No Palindrom");
        }
    }
    
}
