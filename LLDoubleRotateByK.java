public class LLDoubleRotateByK {
    static void rotatebyK(LLDouble obj,int k)
    {
        Node1 head = obj.head;
        Node1 cur = head;
        while(cur.next!=null)
        {
            cur = cur.next;
        }
        Node1 temp = cur;
        int count =1;
        while(count!=k)
        {
            temp = temp.prev;
            count++;
        }
        Node1 last = temp.prev;
        last.next = null;

        cur.next = head;
        head = temp;
        

        //Print ll

        Node1 print = head;
        while(print!=null)
        {
            System.out.println(print.data);
            print = print.next;
        }
    }
    
    
    
    public static void main(String[] args) {
        LLDouble obj = new LLDouble();
        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);
        obj.add(5);

        int n = 2;
        rotatebyK(obj,n);
        
    }
    
}
