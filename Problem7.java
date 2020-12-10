/*
 * Problem7.java
 * 
 * A method for determining whether the complete tree represented by an array 
 * is a heap.
 */ 

public class Problem7 {
    public static <T extends Comparable<T>> boolean isHeap(T[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        
        return isHeapTree(arr, 0);
    }
    
    private static <T extends Comparable<T>> boolean isHeapTree(T[] arr, int i) {
        // Implement this method.
        if (i >= arr.length || arr.length == 1) {
            return true;
        }
        boolean isMaxHeap = arr[0].compareTo(arr[1]) > 0;
        
        if ( (arr[2*i+1].compareTo(arr[i]) > 0) == isMaxHeap && (arr[2*i+2].compareTo(arr[i]) > 0) == isMaxHeap) {
            // if (isHeapTree(arr, 2*i+1) && isHeapTree(arr, 2*i+2)) {
            //     return true;
            // }
            // else {
            //     return false;
            // }
            return (isHeapTree(arr, 2*i+1) && isHeapTree(arr, 2*i+2));
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("--- testing isHeapTree() ---");
        System.out.println();
        System.out.println("(0) an array of integers that is a heap");
        try {
            // Note that we need to use the wrapper class (Integer)
            // instead of the primitive type (int).
            Integer[] arr1 = {50, 30, 35, 25, 23, 13, 18, 8, 20, 16};
            boolean results = isHeap(arr1);
            
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(true);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
                           
        System.out.println();    // include a blank line between tests
                           
        /*
         * Add at least two additional unit tests.
         * Follow the same format that we have used above.
         */

        
        
        
    }
}
