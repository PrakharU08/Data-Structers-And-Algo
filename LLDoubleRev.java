public class LLDoubleRev {
    public static void main(String[] args) {
        LLDouble obj = new LLDouble();
        obj.add(5);
        obj.add(6);
        obj.add(7);
        obj.add(8);
        obj.add(9);
        obj.add(10);
        Node1 head = obj.head;
        Node1 cur = head;
        Node1 temp = null;
        Node head1 = null;
        while(cur!=null)
        {
            temp = cur.prev;
            cur.prev = cur.next;
            cur.next = temp;
            cur = cur.prev;
        }
            
        if(temp!=null)
            head=temp.prev;
        Node1 f = head;
        while(f!=null)
        {
            System.out.println(f.data);
            f = f.next;
        }
    }
}
