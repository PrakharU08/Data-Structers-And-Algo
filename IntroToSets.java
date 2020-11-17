import java.util.*;
public class IntroToSets
{
    public static void main(String args[])
    {
        Set<String> fruits = new HashSet<>();
        //HashSet is a interface in sets
        //There are two more interface which are LinkedHashSet and TreeSet
        //LinkedHashSet are used when We want to print The output in the way it is inserted like in our case [Banana,Apple,kiwi] and it uses Linear time complexity
        //Tree set are used to print the order of Set in SOrted way
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Banana"); 
        System.out.print(fruits);
    }
}