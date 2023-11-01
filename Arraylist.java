import java.util.ArrayList;

public class Arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(70);
        numbers.add(23);
        numbers.add(55);
        numbers.add(43);
        numbers.add(90);
        numbers.add(10);

        System.out.println("Original element at index 5: " + numbers.get(5));

        // Replace the element at index 5
        numbers.set(5, 150);

        boolean contains150 = numbers.contains(150);

        System.out.println("Element at index 5 after replacement: " + numbers.get(5));
        System.out.println("The size of the array is: " + numbers.size());
        System.out.println("Does the array contain 150? " + contains150);

        // Print the entire ArrayList as an array
        System.out.print("ArrayList as an array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
