package io.zackads.github;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BubbleSortTest {

    @Test
    public void givenAnEmptyArray__ThenReturnEmptyArray() {
        int[] input = new int[0];
        int[] expectedOutput = new int[0];

        int[] output = BubbleSort.sort(input);

        assertArrayEquals(output, expectedOutput);
    }

    @Test
    public void givenArrayOfOneElement__ThenReturnArray() {
        int[] input = {0};
        int[] expectedOutput = {0};

        int[] output = BubbleSort.sort(input);

        assertArrayEquals(output, expectedOutput);
    }

    @Test
    public void givenArrayOfTwoElementsOutOfOrder__ThenReturnArrayInOrder() {
        int[] input = {1, 0};
        int[] expectedOutput = {0, 1};

        int[] output = BubbleSort.sort(input);

        assertArrayEquals(output, expectedOutput);
    }

}