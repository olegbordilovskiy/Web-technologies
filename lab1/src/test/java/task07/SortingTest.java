package task07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTest {
    private double[] sourceArr;
    private double[] sortedArr;
    @Test
    void Sorting(){
        sourceArr = new double[] {5,2,0,0,6,1,2,2,11};
        sortedArr = new double[] {0,0,1,2,2,2,5,6,11};
        Assertions.assertArrayEquals(sortedArr,Sorting.Sort(sourceArr));
    }
    @Test
    void emptyArr(){
        sourceArr = new double[] {};
        Assertions.assertArrayEquals(null,Sorting.Sort(sourceArr));
    }
}
