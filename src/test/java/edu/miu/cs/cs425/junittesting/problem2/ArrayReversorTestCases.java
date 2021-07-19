package edu.miu.cs.cs425.junittesting.problem2;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ArrayReversorTestCases {
    FlattenArrayService flatArrService = mock(FlattenArrayService.class);
    ArrayReversor arrRev = new ArrayReversor(flatArrService);

    @Test
    public void arrayReversorTest() {
        int[][] inputArray = new int[][]{{1,3}, {0}, {4,5,9}};
        when(flatArrService.flattenArray(inputArray)).thenReturn(new int[]{1,3,0,4,5,9});
        int[] actual = arrRev.reverseArray(inputArray);
        int[] expected = new int[]{9,5,4,0,3,1};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayReversorNullTest() {
        int[][] inputArray =null;
        when(flatArrService.flattenArray(inputArray)).thenReturn(null);
        int[] actual = arrRev.reverseArray(inputArray);
        assertNull(actual);
    }
}
