import java.util.ArrayList;

public class MergeArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

      
        list1.add(14);
        list1.add(33);
        list1.add(57);
        list1.add(77);
        list1.add(98);

        list2.add(15);
        list2.add(24);
        list2.add(65);

        ArrayList<Integer> mergedList = mergeSorted(list1, list2);

        // Print the merged list
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
    }

    static ArrayList<Integer> mergeSorted(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
              //here if element in list 1 is smaller add it to the mergedlist
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        mergedList.addAll(list1.subList(i, list1.size()));
        mergedList.addAll(list2.subList(j, list2.size()));

        return mergedList;
    }
}
