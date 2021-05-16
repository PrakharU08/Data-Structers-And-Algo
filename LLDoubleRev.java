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
        Node1 temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node1 head1 = temp;
        Node1 cur = temp;
        //2<-->3<-->2<-->3<-->2<-->3
        while(cur.prev != null)
        {
            cur.next = cur.prev;
            cur = cur.prev;
            if(cur.prev == null )
            {
                cur.next = null;
            }

        }    

        Node1 f = head1;
        while(f!=null)
        {
            System.out.println(f.data);
            f = f.next;
        }
    }
}
