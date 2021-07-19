package edu.miu.cs.cs425.junittesting.problem1;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayFlattenerTestCases {
    private ArrayFlattener arrFlat = new ArrayFlattener();

    @Test
    public void arrayFlattenTest() {
        int[][] inputArray = { { 1, 3 }, { 0 }, { 4, 5, 9 } };
        int[] actual = arrFlat.flattenArray(inputArray);
        int[] expected = { 1, 3, 0, 4, 5, 9 };
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayFlattenNullTest() {
        int[][] inputArray = null;
        int[] actual = arrFlat.flattenArray(inputArray);
        int[] expected = null;
        assertArrayEquals(expected, actual);
    }
}
