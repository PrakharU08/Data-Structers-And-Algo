public class RotationOfArray {
    static void reverse(int[] a, int start, int end){
        int temp;
        while(start<=end)
        {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    } 
    static void print1(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
    
        int[] a = {1,2,3,4,5,6};
        int rotate = 3;
        reverse(a, 0, a.length-1);
        reverse(a, 0,rotate-1);
        reverse(a, rotate, a.length-1);
        print1(a);
    }
    
}

    