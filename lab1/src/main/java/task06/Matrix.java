package task06;

public class Matrix {
    public static double[][] GetSquareMatrix(double[] sourceMatrix) {
        if (sourceMatrix.length == 0) return null;
        int matrixSize = sourceMatrix.length;
        double[][] resMatrix = new double[matrixSize][matrixSize];
        resMatrix[0] = sourceMatrix;
        for (int i = 1; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                resMatrix[i][j] = resMatrix[i-1][(j+1)%matrixSize];
            }
        }
        return resMatrix;
    }
}
