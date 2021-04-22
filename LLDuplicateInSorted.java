class LLDuplicateInSorted
{
    static void checkdup(Node head)
    {
        Node temp = head;
        while(temp.next!=null)
        {
            if(temp.data == temp.next.data)
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }
    }
    
    
    public static void main(String args[])
    {
        LL obj = new LL();
        obj.insert(1);
        obj.insert(2);
        obj.insert(2);
        obj.insert(2);
        obj.insert(3);
        obj.insert(3);
        obj.insert(4);
        obj.insert(4);
        Node head = obj.head;
        checkdup(head);
        obj.show();

        
    }
}