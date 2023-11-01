import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add elements to the ArrayList
        numbers.add(12);
        numbers.add(23);
        numbers.add(93);
        numbers.add(400);
        
        // Reverse the ArrayList
        Collections.reverse(numbers);
        System.out.println("["+numbers+"]");
        
        // The sorted ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted array is: ");
        for(int num: numbers){
          System.out.println(num);
        }

    }
}
