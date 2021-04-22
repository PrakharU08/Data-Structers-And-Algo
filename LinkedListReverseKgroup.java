class Node
{
    public Node(int data2) {
    }
    Node next;
    int data;
}





class LinkedListReverseKgroup
{
    public static Node head;

    static void insert(int data)
    {
        Node node = new Node();
        node.data = data;

        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next = node;
        }

    }
    public static Node reversegroup(Node head,int k)
    {
        Node prev = null;
        Node next = null;
        Node curr = head;
        int c = 0;
        if(head==null || head.next==null)
        {
            return head;
        }
        else
        {
            while(curr!=null&&c<k)
            {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                c++;
            }
            if(next!=null)
            {
                head.next = reversegroup(next, k);
            }
        }

        return prev;

    }
    static void showrev(Node prev)
    {
        Node node = prev;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    
    public static void main(String args[])
    {
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        Node abc = reversegroup(head,3);
        showrev(abc);

    }
}