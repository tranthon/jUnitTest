package edu.miu.cs.cs425.junittesting.problem2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReversor {
    private FlattenArrayService flatArrService;

    public ArrayReversor(FlattenArrayService flatArrService) {
        this.flatArrService = flatArrService;
    }

    public int[] reverseArray(int[][] array){
        if(array == null) {
            return null;
        }
        int[] arrFlat = flatArrService.flattenArray(array);
        List<Integer> arr2List = Arrays.stream(arrFlat).boxed()
                .collect(Collectors.toList());
        Collections.reverse(arr2List);
        return arr2List.stream().mapToInt(a->a).toArray();
    }
}
