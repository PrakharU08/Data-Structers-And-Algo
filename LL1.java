public class LL1
{
    public static Node head;

    void insert(int data)
    {
        Node node = new Node(data);
        

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

    Node reverse(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;  
        }

        return prev;
        
    }

    Node reverse()
    {
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;  
        }

        return prev;
        
    }
    void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    void showrev(Node prev)
    {
        Node node = prev;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
