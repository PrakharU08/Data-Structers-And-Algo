public class LLMergeSort {
    static Node findmiddle(Node cur) {
        
        if(cur==null)
            return cur;
        
        Node first = cur;
        Node sec = cur;
        
        while (sec.next!= null && sec.next.next!=null) {
            first = first.next;
            sec = sec.next.next;
        }
        sec = first.next;
        first.next = null;
        return sec;
    }

    static Node merge11(Node first, Node sec) {
        Node result = null;

        if (first == null)
            return sec;
        if (sec == null)
            return first;

        if(first.data<sec.data)
        {
            result = first;
            result.next = merge11(first.next, sec);
        }
        else
        {
            result = sec;
            result.next = merge11(first, sec.next);
        }

        return result;
    }

    static Node mergesort1(Node head) {
        if(head==null || head.next==null)
            return head;
        Node sec = findmiddle(head);
        Node left = mergesort1(head);
        Node right = mergesort1(sec);

        Node head1 = merge11(left, right);
        return head1;

    }

    public static void main(String[] args) {
        LL obj = new LL();
        obj.insert(9);
        obj.insert(2);
        obj.insert(3);
        obj.insert(5);
        obj.insert(6);
        obj.insert(1);
        obj.insert(9);
        Node head = obj.head;
        
        obj.showrev(mergesort1(head));

    }

}
