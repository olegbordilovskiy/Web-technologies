package task02;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.CsvSource;


public class AffiliationTest {
    @ParameterizedTest
            (name = "Test {index}: x = {0} and y = {1}")
    @CsvSource({
            "4, 4, True",
            "-1, 3, True",
            "500, 348, False",
            "-6, -3, True",
            "7, 7, False",
    })
    public void isBelong(int x, int y, boolean result){
        boolean res = Affiliation.isBelong(x,y);
        Assertions.assertEquals(result,res);
    }
}
