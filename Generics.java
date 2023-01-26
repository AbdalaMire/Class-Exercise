import java.util.ArrayList;

public class Generics<T> {
    private final ArrayList<T> list = new ArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    public static void main(String[] args) {
        Generics<String> example = new Generics<>();
        example.add("Abdi");
        example.add("SHaranshuur");

        String first = example.get(0);
        String second = example.get(1);

        System.out.println(first);
        System.out.println(second);
    }
}

//This is an example of using generics in Java. 
//The class GenericExample is defined with a type parameter T. 
//This means that when the class is instantiated, a specific type (such as String or Integer) can be passed as the type parameter. 
//In this case, the class GenericExample is being used to create a list of strings. 
//The add method takes a single argument of type T, and the get method returns an object of type T. 
//In the main method, the class is instantiated with String as the type parameter and used to add and retrieve strings from the list.