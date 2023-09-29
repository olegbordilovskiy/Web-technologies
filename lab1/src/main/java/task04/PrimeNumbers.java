package task04;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static List<Integer> GetPrimaryIndexes(int[] arr) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (isPrimary(arr[i])) indexes.add(i);
        }
        return indexes;
    }

    private static boolean isPrimary(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void PrintIndexes(List<Integer> indexes) {
        for (int ind : indexes) {
            System.out.print(ind + ", ");
        }

    }
}
