import java.util.Iterator;
import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> l1 = new ArrayDeque<>();
                // Array Deque Ma Add karva 
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(6);
        System.out.println("add element in the list " + l1);

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
        ArrayDeque<Integer> l2 = (ArrayDeque<Integer>) l1.clone();
        System.out.println("Meri Duplicate Copy: " + l2);

        // contains if list is contain element than print true or false
        System.out.println(l1.contains(12));

        // Print First ELement Of the list 
        System.out.println(l1.element()); 

        // Return First Element In the List
        System.out.println(l1.getFirst());

        // Return Last Element In the List
        System.out.println(l1.getLast());
        
        // Remove Specific Element in the deque use remove Method.
        System.out.println(l1.remove(2)); 

        // size() yeh list ki size return karta hai
        System.out.println(l1.size());

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

        // isempty() true if no element in the deqe
        System.out.println(l1.isEmpty());

        //offer method used to insert at the end of the deque
        l1.offer(50);
        System.out.println(l1);

        //offerFirst Method used to insert front of the deque
        l1.offerFirst(51);
        System.out.println(l1);

        //offerLast Method used to insert at the end of the deque
        l1.offerLast(52);
        System.out.println(l1);

        // peek
        l1.peek();
        System.out.println(l1);

        // poll method is used to remove first element or head of the deque
        l1.poll();
        System.out.println(l1);

        // pop() Method used to remove an element for front or head
        l1.pop();
        System.out.println(l1);

        // push() Method used to add an element for front or head
        l1.push(7);
        System.out.println(l1);


    }
}
