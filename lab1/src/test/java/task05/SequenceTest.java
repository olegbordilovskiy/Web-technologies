package task05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SequenceTest {
    private int[] arr;
    @Test
    void GetMinimalNumber() {

        arr = new int[] {};
        Assertions.assertEquals(0,Sequence.GetMinimalNumber(arr));

        arr = new int[] {1, 2, 3, 4, 5};
        Assertions.assertEquals(0,Sequence.GetMinimalNumber(arr));

        arr = new int[] {5, 4, 3, 2, 1};
        Assertions.assertEquals(4,Sequence.GetMinimalNumber(arr));

        arr = new int[] {1, 3, 2, 5, 4};
        Assertions.assertEquals(2,Sequence.GetMinimalNumber(arr));

        arr = new int[] {10, 20, 10, 30, 25, 35};
        Assertions.assertEquals(2,Sequence.GetMinimalNumber(arr));

        arr = new int[]  {9, 1};
        Assertions.assertEquals(1,Sequence.GetMinimalNumber(arr));

    }
}
