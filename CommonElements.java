import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        List<Integer> commonElements = new ArrayList<Integer>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements.add(array1[i]);
                    break;
                }
            }
        }

        System.out.println("Common elements are: " + commonElements);
    }
}


//This program uses two nested loops to iterate over both arrays 
//and check if any element in array1 is also present in array2.
//If a common element is found, it is added to a list of common elements. 
//The final list of common elements is then printed to the console.