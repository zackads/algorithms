package io.zackads.github;

public class BubbleSort {
    static int[] sort(int[] array) {

        boolean swapped = false;
        do {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                } else {
                    swapped = false;
                }
            }
        } while (swapped);

        return array;
    }
}
