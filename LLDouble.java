class Node1
{
    int data;
    Node1 next;
    Node1 prev;
    Node1(int data)
    {
        this.data = data;
    }
}

public class LLDouble {
    
    public static Node1 head;
    static void add(int data)
    {
        Node1 newnode = new Node1(data);
        
        if(head==null)
        {
            head = newnode;
            head.prev = null;
        }
        else
        {
            Node1 n =head;
            while(n.next!=null)
            {
                n = n.next;     
            }
            n.next = newnode;
            Node1 temp = n.next;
            temp.prev = n;
        }

    }

    static void show()
    {
        Node1 node = head;
        while(node.next!=null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    static void rev()
    {
        Node1 temp = head;
        
        while(temp.next != null)
        {
            temp = temp.next;
        }

        while(temp!=null)
        {
            
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public static void main(String[] args) {
        
        LL obj = new LL();
        add(2);
        add(3);
        add(4);
        add(5);
        show();
        System.out.println();
        rev();

    }
    
}
