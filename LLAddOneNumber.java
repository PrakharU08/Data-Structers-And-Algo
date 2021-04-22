class LLAddOneNumber {
    public static void main(String[] args) {
        LL obj = new LL();
        obj.insert(2);
        obj.insert(9);
        obj.insert(8);
        obj.insert(9);
        Node hea = obj.head;
        Node head = obj.reverse(hea);
        Node curr = head;
        while(curr!=null)
        {
            if(curr.next==null && curr.data == 9)
            {
                curr.data = 1;
                Node temp = new Node();
                temp.data =0;
                temp.next = head;
                head = temp;
                curr = curr.next;
            }
            else if(curr.data==9)
            {
                curr.data = 0;
                curr = curr.next;
            }
            else
            {
                curr.data = curr.data + 1;
                curr = curr.next;
                break;
            }
        }
        obj.reverse(head);
        obj.show();     
    }    
}
