
class LLLastNodeFront
{
    static Node move(Node head)
    {
        Node seclast = null;
        Node last = head;
        while(last.next!=null)
        {
            seclast = last;
            last = last.next;
        }
        seclast.next = null;
        last.next = head;
        head = last;

        return head;
    }
    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.insert(4);
        obj.insert(3);
        obj.insert(5);
        obj.insert(2);
        obj.insert(1);
        obj.insert(7);
        Node head = obj.head;
        obj.showrev(move(head));
    }
}