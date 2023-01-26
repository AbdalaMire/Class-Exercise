import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Collections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // add elements to the list
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        System.out.println("Original list: " + numbers);

        // sort the list
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

        // shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled list: " + numbers);

        // get the maximum and minimum element
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);

        // fill the list with a specific value
        Collections.fill(numbers, 0);
        System.out.println("Filled with 0: " + numbers);
    }
}

//This is an example of using the Collections class in Java to manipulate a List of integers. 
//The example creates a list and adds some elements to it, then sorts, reverses, and shuffles the list using the sort, reverse, and shuffle methods respectively.
//The max and min methods are used to find the maximum and minimum element in the list. 
//The fill method is used to fill the list with a specific value.
//The Collections class provides several static methods that can be used to perform various operations on collections such as sorting, reversing, shuffling, and searching for elements in a list. 
//It can be used with any class that implements the Collection interface, including List, Set, and Queue.