import java.util.ArrayList;
import java.util.Comparator;

public class ArraylistMethods {
  static ArrayList<Integer> duplicate = new ArrayList<>();

  public void sampleArray() {
   ArrayList<Integer> num = new ArrayList<>();
    num.add(234);
    num.add(34);
    num.add(786);
    num.add(45);

    System.out.println("Elements in num ArrayList:");
    for (Integer value : num) { // for any value in num array get value
      System.out.println(value);
    }
    System.out.println("The first element in the array is: " + num.get(0));
    int index=num.indexOf(45);
    System.out.println("index of 34 is:"+index);
  }

  public static void main(String[] args) {
        // Create an instance of the class and call the addInt method
        ArraylistMethods arrayListMethods = new ArraylistMethods();
        arrayListMethods.sampleArray();
        duplicate.add(3564);
        duplicate.add(56);
        duplicate.add(100);
        duplicate.add(21);
        duplicate.add(33);
        boolean check=duplicate.contains(56);//checks if  specified element is present 
        System.out.println("Array duplicate has 53? "+check); //output:true
        if (check==true){
          System.out.println("Am good in coding");
        }
        ArrayList<Integer> sublist=new ArrayList<>( duplicate.subList(1,3));
        System.out.println(sublist);
        duplicate.set(3,999099);
        duplicate.sort(Comparator.naturalOrder());
        System.out.println(duplicate);
    }
}
/*
 * .size() returns the size of arraylist
 * .isEmpty() returns true if 0 element vice versa
 * .subList()returns a portion of arraylist from the given arraylist
 * .set()replace element with an element
 * .sort(Comparator.)
 */
