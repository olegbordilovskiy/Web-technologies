package task08;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexesTest {
    private double[] firstSequence;
    private double[] secondSequence;
    private List<Integer> indexes;

    @Test
    void GetIndexes() {
        firstSequence = new double[]{1.0, 3.0, 5.0, 7.0, 9.0};
        secondSequence = new double[]{2.0, 4.0, 6.0};
        indexes = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(indexes,Indexes.GetIndexes(firstSequence,secondSequence));
    }
    @Test
    void GetIndexes1() {
        firstSequence = new double[]{3.0, 5.0, 7.0, 9.0};
        secondSequence = new double[]{2.0, 4.0, 6.0};
        indexes = Arrays.asList(0, 2, 4);
        Assertions.assertEquals(indexes,Indexes.GetIndexes(firstSequence,secondSequence));
    }

}
