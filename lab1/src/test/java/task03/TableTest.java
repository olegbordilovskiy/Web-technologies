package task03;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TableTest {
    @Test
    public void GetValues(){
        Object[][] result = Table.GetValues(0, 10, 1);
        Assertions.assertEquals(11, result.length,0.001);
        Assertions.assertEquals(0.871, (double)result[7][1], 0.001);
        Assertions.assertEquals(-2.185, (double)result[2][1], 0.001);
        Assertions.assertEquals(0, (double)result[0][1], 0.001);
        Assertions.assertEquals(-0.452, (double)result[9][1], 0.001);
    }
}
