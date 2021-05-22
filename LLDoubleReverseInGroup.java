public class LLDoubleReverseInGroup {
    
    static Node1 reversedoubley(Node1 head,int k)
    {
        int c = 0;
        if(head== null || head.next == null)
        {
            return head;
        }
        Node1 cur = head;
        Node1 temp = null;
        while(cur!=null || c<k)
        {
            // System.out.println(cur.data);
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;
            cur = cur.prev;
            c++;
        }
        if(cur!=null)
        {
            cur.prev  = reversedoubley(cur, k);
            
        }

        return temp;
    }
    
    
    
    public static void main(String[] args) {
        LLDouble obj = new LLDouble();
        obj.add(10);
        obj.add(8);
        obj.add(4);
        obj.add(2);
        // obj.add(5);
        // obj.add(1);
        int k = 2;
        Node1 head = obj.head;
        Node1 head1 = reversedoubley(head,k);
        // System.out.println(head.data);
        while(head1.next!=null)
        {
            head1 = head1.next;
            System.out.print(head1.data + " ");
        }
    }
}
