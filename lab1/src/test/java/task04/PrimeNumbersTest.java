package task04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumbersTest {
    @Test
    void GetPrimaryIndex() {
        int[] arr = new int[] {10, 23, 9, -9, 7, 122, 12, 11, 25, 3};
        List<Integer> expected = Arrays.asList(1, 4, 7, 9);
        List<Integer> result = (PrimeNumbers.GetPrimaryIndexes(arr));
        Assertions.assertEquals(expected,result);
    }
}
