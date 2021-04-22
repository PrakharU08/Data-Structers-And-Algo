import java.util.HashMap;

public class LLDuplicateInUnsorted {
    
    static void checkdup(Node head)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        Node curr = head;
        map.put(curr.data,1);
        Node prev = curr;
        curr = curr.next;
        while(curr!=null)
        {
            if(map.containsKey(curr.data))
            {
                prev.next = curr.next;
                
            }
            else
            {
                map.put(curr.data,1);
                prev = curr;
            }
            curr = prev.next;
        }

    }
    
    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.insert(6);
        obj.insert(5);
        obj.insert(5);
        obj.insert(2);
        obj.insert(2);
        obj.insert(3);
        Node head = obj.head;
        checkdup(head);
        obj.show();
    }
}
