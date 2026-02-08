import java.util.*;

public class HashSetDemo {
    @SuppressWarnings("unchecked") // Ye line magic karegi
    public static void main(String[] args) {
        HashSet<Integer> l1 = new HashSet<>();
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(9);
        System.out.println("add element in the HashSet " + l1);

        //clear is use to all element in the HashSet is delete .
        // l1.clear();
        // System.out.println("clear all element in the HashSet " + l1);

        // --- 1. CLONE KA SAHI TARIKA ---
        // Clone se jo mila, usko 'l2' mein rakha
        HashSet<Integer> l2 = (HashSet<Integer>) l1.clone();
        System.out.println("Meri Duplicate Copy: " + l2);

        // contains if HashSet is contain element than print true or false
        System.out.println(l1.contains(12));

         // isempty() true if no element in the deqe
        System.out.println(l1.isEmpty());

        // Remove Element In the Set If Present . Use remove() method.
        System.out.println(l1.remove(2)); 

        // size() yeh Set ki size return karta hai
        System.out.println(l1.size());

    }
}


