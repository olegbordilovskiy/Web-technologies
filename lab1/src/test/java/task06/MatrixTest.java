package task06;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixTest {
    private double[] arr;
    private double[][] result;
    @Test
    void testSquareMatrixWithValidInput() {
        arr = new double[] {1, 2, 3, 4, 5};
        result = new double[][] {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2},
                {4, 5, 1, 2, 3},
                {5, 1, 2, 3, 4}};
        Assertions.assertArrayEquals(result, Matrix.GetSquareMatrix(arr));
    }

    @Test
    void testSquareMatrixWithEmptyInput() {
        arr = new double[] {};
        Assertions.assertArrayEquals(null, Matrix.GetSquareMatrix(arr));
    }

    @Test
    void testSquareMatrixWithSingleElementInput() {
        arr = new double[] {1};
        result = new double[][] {{1}};
        Assertions.assertArrayEquals(result, Matrix.GetSquareMatrix(arr));
    }

}
