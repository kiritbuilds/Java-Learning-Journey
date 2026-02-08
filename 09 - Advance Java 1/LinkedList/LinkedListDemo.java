import java.util.*;
import java.util.Iterator;

public class LinkedListDemo{
    @SuppressWarnings("unchecked") // Ye line magic karegi
    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList<>();
        
        // LinkedList Ma Add karva 
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(6);
        System.out.println("add element in the list " + l1);

        //add specific index 
        l1.add(2,10);
        System.out.println("add element in the Specific index " +  l1);

        //addFirst is used to add First Element In The list
        l1.addFirst(11);
        System.out.println("add First Element In the List "+ l1);

        // addLast is used to add last element in the list
        l1.addLast(12);
        System.out.println("add Last Element In the List " + l1);

        //clear is use to all element in the list is delete .
        // l1.clear();
        // System.out.println("clear all element in the list " + l1);

        // --- 1. CLONE KA SAHI TARIKA ---
        // Clone se jo mila, usko 'l2' mein rakha
        LinkedList<Integer> l2 = (LinkedList<Integer>) l1.clone();
        System.out.println("Meri Duplicate Copy: " + l2);

        // contains if list is contain element than print true or false
        System.out.println(l1.contains(12));

        // Print First ELement Of the list 
        System.out.println(l1.element()); 

        // Return Specific Index Data or Element 
        System.out.println(l1.get(3));

        // Return First Element In the List
        System.out.println(l1.getFirst());

        // Return Last Element In the List
        System.out.println(l1.getLast());
        
        // Find Index Of Specific List element indexOf()
        System.out.println(l1.indexOf(6));

        // indexOf Method Only Print First Element Index But Multiple Elements Same and
        // Index Are Different That time use lastindexOf Method
        System.out.println(l1.lastIndexOf(6));
        
        // Remove Element In the Specific Position or Index In The List Use remove() method.
        System.out.println(l1.remove(2)); 

        //set(index,element) It Is The Method to replace any element in specifix index 
        // like index 3 6 to replace index 3 is 80 it set method
        System.out.println(l1.set(3, 80));
        System.out.println(l1);

        // size() yeh list ki size return karta hai
        System.out.println(l1.size());

        // Descending Order Ma Convert Karva
        Collections.sort(l1, Collections.reverseOrder());
        System.out.println("Descending Order Sort " + l1);

         // Ascending Order Ma Leva Mate collection.sort() use karvu
        Collections.sort(l1);
        System.out.println("Ascending Order Sort " + l1);

        //ToArray Method Use Karva MAte list ne array ma convert kari array ma use thay che...
        System.out.println("Converting Array ");
        Object[] arr = l1.toArray();

        // Array Print Karva Mate
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // descendingIterator() How to used this method 
        // --- 2. DESCENDING ITERATOR KA SAHI TARIKA ---
        System.out.print("Ulta Print (Descending): ");
        Iterator<Integer> it = l1.descendingIterator();
        
        while(it.hasNext()){
            System.out.print(it.next() + " "); 
        }
        System.out.println();
    }
}