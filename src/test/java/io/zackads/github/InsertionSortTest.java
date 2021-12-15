package io.zackads.github;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class InsertionSortTest  {
    static Stream<Arguments> unsortedAndSortedArrayProvider() {
        return Stream.of(
                arguments(new int[0], new int[0]),
                arguments(new int[]{0}, new int[]{0}),
                arguments(new int[]{0, 1}, new int[]{0, 1}),
                arguments(new int[]{1, 0}, new int[]{0, 1}),
                arguments(new int[]{3, 2, 1}, new int[]{1, 2, 3})
        );
    }

    @Timeout(value = 10, unit = MILLISECONDS)
    @ParameterizedTest
    @MethodSource("unsortedAndSortedArrayProvider")
    public void givenAnEmptyArray__ThenReturnEmptyArray(int[] input, int[] expectedOutput) {
        assertArrayEquals(expectedOutput, InsertionSort.sort(input));
    }
}