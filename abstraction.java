public class abstraction {
    public static void main(String[] args) {
    
        BMW obj = new BMW();
        obj.start();
    }
    
}

abstract class Car
{
    int price;
    abstract void start();

}

class BMW extends Car
{
    void start()
    {
        System.out.println("BMW is Starting");
    }
}

class Audi extends Car
{
    void start()
    {
        System.out.println("AUDI is Starting");
    }
}

