package task05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceTest {
    @Test
    void GetMinimalNumber() {

        int[] arr0 = {};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 3, 2, 5, 4};
        int[] arr4 = {10, 20, 10, 30, 25, 35};
        int [] arr5 = {9, 1};

        Assertions.assertEquals(0,Sequence.GetMinimalNumber(arr0));
        Assertions.assertEquals(0,Sequence.GetMinimalNumber(arr1));
        Assertions.assertEquals(4,Sequence.GetMinimalNumber(arr2));
        Assertions.assertEquals(2,Sequence.GetMinimalNumber(arr3));
        Assertions.assertEquals(2,Sequence.GetMinimalNumber(arr4));
        Assertions.assertEquals(1,Sequence.GetMinimalNumber(arr5));
    }
}
