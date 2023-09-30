package task07;

public class Sorting {
    public static double[] Sort(double[] sourceArr) {
        if (sourceArr.length == 0) return null;
        double[] result = sourceArr.clone();
        for (int i = 0; i < result.length - 1; i++) {
            for (int j = 0; j < result.length - i - 1; j++) {
                if (result[j] > result[j + 1])
                    Swap(j, j + 1, result);
            }
        }
        return result;
    }

    private static void Swap(int ind1, int ind2, double[] arr) {
        double temp;
        temp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = temp;
    }
}
