import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        // List Ma Add Karva add() Method
        l1.add(5);
        l1.add(6);
        l1.add(6);
        System.out.println(l1);

        // Specific Position Ke Index Uper Add Karva add(index,element) Method.
        l1.add(1, 4);
        System.out.println(l1);

        // Badha Element Remove Karva List Mathi clear() Method
        // l1.clear();
        // System.out.println(l1);

        // Element List Ma Che Ke Nahin Check Karva contains() method
        // Hase To True And Neither False Print
        System.out.println(l1.contains(5));

        // Koi Array List Na Element Ni Index Janva Mate indexOf()
        System.out.println(l1.indexOf(6));

        // indexOf Method Only Print First Element Index But Multiple Elements Same and
        // Index Are Different That time use lastindexOf Method
        System.out.println(l1.lastIndexOf(6));

        // isEmpty() method returns True If No ELement In The List
        System.out.println(l1.isEmpty()); 

        // Remove Element In the Specific Position or Index In The List Use remove() method.
        // System.out.println(l1.remove(2)); 

        //set(index,element) It Is The Method to replace any element in specifix index 
        // like index 3 6 to replace index 3 is 80 it set method
        System.out.println(l1.set(3, 80));
        System.out.println(l1);

        // size() yeh list ki size return karta hai
        System.out.println(l1.size());

        // toArray() 
        // System.out.println(l1.toArray());

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(18);
        l2.add(16);
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l2);

        // Ascending Order Ma Leva Mate collection.sort() use karvu
        Collections.sort(l1);
        System.out.println("Ascending Order Sort " + l1);

        // Descending Order Ma Convert Karva
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending Order Sort " + l1);

        //ToArray Method Use Karva MAte list ne array ma convert kari array ma use thay che...
        System.out.println("Converting Array ");
        Object[] arr = l1.toArray();

        // Array Print Karva Mate
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}