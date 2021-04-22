public class LLIntersectionOfTwoSorted {
    
    static Node checkintersection(Node first,Node second)
    {
        Node tempfirst = first;
        Node tempsec = second;
        Node head = null;
        Node cur = null;
        while(tempfirst!=null && tempsec!=null)
        {
            if(tempfirst.data == tempsec.data)
            {
                if(head==null)
                {
                    Node a = new Node(tempfirst.data);
                    head = a;
                    cur = a;
                }
                else
                {
                    Node a = new Node(tempfirst.data);
                    cur.next = a;
                    cur = cur.next;
                }
                tempfirst = tempfirst.next;
                tempsec = tempsec.next;
            }
            else if(tempfirst.data<tempsec.data)
            {
                tempfirst = tempfirst.next;
            }
            else
            {
                tempsec = tempsec.next;
            }
        }
        return head;
    }
    
    
    
    
    public static void main(String[] args) {
        LL obj = new LL();
        obj.insert(2);
        obj.insert(5);
        obj.insert(6);
        obj.insert(7);
        Node first = obj.head;
        LL1 obj1 = new LL1();
        obj1.insert(1);
        obj1.insert(2);
        obj1.insert(5);
        obj1.insert(7);
        Node second = obj1.head;
        Node res = checkintersection(first,second);
        obj.showrev(res);
    }
    
}
