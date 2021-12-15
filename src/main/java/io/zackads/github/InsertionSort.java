package io.zackads.github;

public class InsertionSort {

    /**
     * Insertion sort
     *
     * Time complexity
     *      Best case       O(n) (array is already sorted)
     *      Worst case      O(n^2) (array is in reverse order, so every iteration of the inner loop will scan and shift
     *                      the entire sorted subsection of the array before inserting the next element)
     *      Average case    O(n^2)
     *
     * Why is insertion sort interesting?
     *
     *      Because its average case is quadratic, insertion sort is impractical for sorting large arrays.  However, it
     *      can be faster than divide-and-conquer sorting algorithms such as quicksort for smaller arrays of ~7 to ~50
     *      elements.  The most efficient sorting algorithms using a hybrid approach frequently use insertion sort for
     *      smaller arrays.
     *
     * @param array - an unsorted array
     * @return a sorted array
     */
    public static int[] sort(int[] array) {
        // Outer loop: iterate up the array from 0
        for (int i = 1; i < array.length; i++) {
            // Inner loop: iterate backwards from i towards the beginning,
            // swapping elements that are out of order
           for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {
               int temp = array[j];
               array[j] = array[j - 1];
               array[j - 1] = temp;
           }
        }

        return array;
    }
}
