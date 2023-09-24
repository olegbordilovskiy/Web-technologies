package task01;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @Test
    void Result(){
        double res = Calculator.Result(10.0,20.0);
        Assertions.assertEquals(10.164,res,0.001);
    }
}
