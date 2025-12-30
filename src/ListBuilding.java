import java.util.ArrayList;

public class ListBuilding {
    public static void main(String[] args) throws Exception {
        // 1. Create an ArrayList of Integers called 'list' (be sure to import the class)
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("After step 1: " + list);

        // 2. Add the number 1 - 10 to list
        //    (try with a for loop)
        for(int i = 1; i < 11; i++){
            list.add(i);
        }
        System.out.println("After step 2: " + list);

        // 3. Add 0 to the beginning of the list
        //    and add another 0 at index 5
        list.add(0, 0);
        list.add(5, 0);
        System.out.println("After step 3: " + list);

        // 4. Set the element at index 1 to -1
        //    Set the element at index 4 to -2
        list.set(1, -1);
        list.set(4, -2);
        System.out.println("After step 4: " + list);

        // 5. Assuming the current element values are not known:
        //    Set the element at index 2 to double its current value  
        //    Reduce the value of the element at index 6 by 2
        //    Set the element at index 3 to the sum of the last 3 elements
        list.set(2, list.get(2) * 2);
        list.set(6, list.get(6) - 2);
        list.set(3, list.get(9) + list.get(10) + list.get(11));
        System.out.println("After step 5: " + list);

        // 6. Remove the first 2 elements from the ArrayList
        list.remove(0);
        list.remove(0);
        System.out.println("After step 6: " + list);

        //7. Remove the last two elements from the ArrayList
        //   (Write generally, i.e. do not use literal index numbers)
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
        System.out.println("After step 7: " + list);

    }
}
