public class RotationOfString {
    public static void main(String args[])
    {
        String a  = "avajava";
        String b =  "javaava";
        if(a.length()!=b.length())
        {
            System.out.print("Is not a rotation as len not equal");
        }
        else
        {
            String c = a + b;
            if(c.contains(b))
            {
                System.out.print("Yes B is rotation of A");
            }
            else
            System.out.print("Not a Rotation");
        }
    }
}
