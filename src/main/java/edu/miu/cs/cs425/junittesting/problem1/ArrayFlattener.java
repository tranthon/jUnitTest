package edu.miu.cs.cs425.junittesting.problem1;

import java.util.Arrays;

public class ArrayFlattener {
    public  int[] flattenArray(int[][] array){
        if(array == null) {
            return null;
        }
        return Arrays.stream(array)
                .flatMapToInt(a -> Arrays.stream(a))
                .toArray();
    }
}
