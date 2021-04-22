class LLAddTwoNumberRepresentedAsLL
{
    static void AddTwoNumber(Node first,Node sec)
    {
        LL obj = new LL();
        first = obj.reverse(first);
        sec = obj.reverse(sec);
        int c = 0;
        int s = 0;
        Node temp;
        Node cur = null;
        Node res = null;
        while(first!=null || sec!=null)
        {
            s = c+(first != null?first.data:0)+(sec != null?sec.data:0);
            c = (s>=10)?1:0;
            s = s%10;
            temp = new Node(s);
            if(res == null)
            {
                res = temp;
            }
            else
            {
                cur.next = temp;
            }
            cur = temp;
            if(first!=null)
            {
                first = first.next;
            }
            if(sec!=null)
            {
                sec = sec.next;
            }
        }
        if(c>0)
            {
                temp = new Node(c);
                cur.next = temp;
                cur = temp;
            }
        res = obj.reverse(res);
        obj.showrev(res);

    }
    
    
    
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insert(5);
        list1.insert(6);
        list1.insert(7);
        Node first = list1.head; 
        LL1 list2 = new LL1();
        list2.insert(5);
        list2.insert(7);
        Node sec = list2.head; 
        AddTwoNumber(first,sec);

    }
}