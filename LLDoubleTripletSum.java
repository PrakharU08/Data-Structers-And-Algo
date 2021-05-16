public class LLDoubleTripletSum {
    
    static void tripletcheck(LLDouble obj,int sum)
    {
        Node1 cur = obj.head;
        Node1 sec = obj.head;
        while(sec.next!=null)
        {
            sec= sec.next;
        }
        //1<->2<->4<->5<->6<->7
        /*
        cur = 1 , sum = 13   
        first = 2
        last = 7  left=12   9<12 11<12 */
        //13
        //leftover = 12 
        //1 2<->4<->5<->6<->7
        while(cur!=null)
        {
            int leftoversum = sum-cur.data;
            Node1 first = cur.next;
            Node1 last = sec;
            while(first != null && last!= null &&first != last && last.next != first)
            {
                if(first.data+last.data==leftoversum)
                {
                    
                    System.out.println("("+cur.data+ ","  +first.data+ ","+last.data+")");
                    first=first.next;
                    last=last.prev;
                }
                else
                {      
                    if(first.data+last.data<leftoversum)
                    {
                        first = first.next;

                    }

                    else if(first.data+last.data>leftoversum)
                    {
                        last = last.prev;
                    }
                }
            
            }
            cur =cur.next;
            // System.out.println(cur.data); 
        }
    }   
    
    
    
    public static void main(String[] args) {
        LLDouble obj = new LLDouble();
        obj.add(1); //1 5 9     2 5 8   6 8 1   2 4 9   //
        obj.add(2);
        obj.add(4);
        obj.add(5);
        obj.add(6);
        obj.add(8);
        obj.add(9);
        int sum = 15;
        tripletcheck(obj,sum);
        
    }
    
}
