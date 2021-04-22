public class OOPsPractice {
    public static void main(String args[]) {
        
        A obj2 = new A(5);
        obj2.display();
        obj2.a = 7;
        obj2.display();

        Person obj = new Person();
        obj.name = "Prakhar";
        obj.age = 12;

        Person obj1 = new Person(20,"Mei");
        //obj1.name = "Mei";
        //obj1.age = 20;

        Devloper d1 = new Devloper(34,"Earth");
        d1.walk();
        //Devloper will have all the methods of Person

        //System.out.println(obj.name+" "+obj.age);
        //System.out.println(obj1.name+" "+obj1.age);

        //obj1.walk();
        //obj.eat();

        System.out.println(Person.count);

    }
    
}

class Person{
    String name;
    int age;

    static int count =0;

    Person()
    {
        count++;
    }

    /*
    Person(int newAge, String newName)
    {
        this();//This keyword is used to call constructor with no argument or the outermost constructor
        age = newAge;
        name = newName;
    }
    */

    Person(int age,String name)
    {
        this.age = age;
        //this corresponds to objects of this class;
        this.name = name;
    }
    void walk()
    {
        System.out.println(name+ " is Walking.");
    }

    void eat()
    {
        System.out.println(name+ " is eating.");
    }

}

class Devloper extends Person
{
    Devloper(int age,String name)
    {
        super(age,name);
        //Helps us to call parent constructor as both the constructor should have similar arguments
    }
    void walk()
    {
        System.out.println("Devloper "+name+ " is Walking.");
    }
}


class A
{
    static int a;

    A(int a)
    {
        this.a = 9;
    }

    public static void display()
    {
        System.out.println(a);
    }
}
