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
        if (i >= arr.length || arr.length == 1 || 2*i + 2 >= arr.length) {
            return true;
        }
        boolean isMaxHeap = arr[0].compareTo(arr[1]) > 0;
        
        if ( (arr[2*i+1].compareTo(arr[i]) < 0) == isMaxHeap && (arr[2*i+2].compareTo(arr[i]) < 0) == isMaxHeap) {
            return (isHeapTree(arr, 2*i+1) && isHeapTree(arr, 2*i+2));
        }
        else {
            System.out.println("false");
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
        
        System.out.println("(1) an array of integers that is not a heap");
        try {
            // Note that we need to use the wrapper class (Integer)
            // instead of the primitive type (int).
            Integer[] arr2 = {50, 30, 35, 25, 23, 13, 38, 8, 20, 16};
            boolean results2 = isHeap(arr2);
            
            System.out.println("actual results:");
            System.out.println(results2);
            System.out.println("expected results:");
            System.out.println(false);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results2 == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
                           
        System.out.println();

        System.out.println("(2) an array of integers that is a heap");
        try {
            // Note that we need to use the wrapper class (Integer)
            // instead of the primitive type (int).
            Integer[] arr3 = {10, 30, 35, 55, 63, 43, 48, 62, 56, 81, 100, 54, 55, 50, 64};
            boolean results3 = isHeap(arr3);
            
            System.out.println("actual results:");
            System.out.println(results3);
            System.out.println("expected results:");
            System.out.println(true);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results3 == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
                           
        System.out.println();
        
        System.out.println("(3) an array of integers that is not a heap");
        try {
            // Note that we need to use the wrapper class (Integer)
            // instead of the primitive type (int).
            Integer[] arr4 = {10, 30, 35, 55, 63, 43, 48, 62, 56, 81, 100, 54, 55, 50, 64, 64, 68, 58, 77, 80, 83, 101, 120};
            boolean results4 = isHeap(arr4);
            
            System.out.println("actual results:");
            System.out.println(results4);
            System.out.println("expected results:");
            System.out.println(false);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results4 == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
                           
        System.out.println();
        
    }
}
