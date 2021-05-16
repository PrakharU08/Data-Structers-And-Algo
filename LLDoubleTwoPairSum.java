public class LLDoubleTwoPairSum {
    
    static void checkpairsum(int sum,LLDouble obj)
    {
        Node1 head = obj.head;
        Node1 first = head;
        Node1 last = head;
        int flag = 0;
    
        while(last.next!=null)
        {
            last = last.next;
        }

        int arr[] = new int[2];
        while(first!=last)
        {
        
            if(first.data + last.data == sum)
            {
                // arr[0] = first.data;
                // arr[1] = last.data;
                System.out.println("Pair Found : (" +first.data+  "," +last.data+")");
                first = first.next;
                last = last.prev;
                flag = 1;
            }
            else
            {
                if(first.data+last.data<sum)
                {
                    last = last.prev;
                }
                else
                {
                    first = first.next;
                }
            }
        }
        if(flag == 0)
            System.out.println("No pair found");

        // arr[0] = 0;
        // return arr;

    }
    
    
    
    
    
    public static void main(String[] args) {
        LLDouble obj = new LLDouble();
        obj.add(5);
        obj.add(6);
        obj.add(9);
        obj.add(10);
        obj.add(16);
        obj.add(17);
        int sum = 22;
        checkpairsum(sum,obj);
        // System.out.println("Pair Found : (" +arr[0]+  "," +arr[1]+")");

    }
    
}
