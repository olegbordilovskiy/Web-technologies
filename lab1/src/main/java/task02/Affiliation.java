package task02;

public class Affiliation {
    static private boolean isBelongToUpperArea(int x, int y) {

        if (x >= -4 && x <= 4 && y >= 0 && y <= 5) return true;
        else return false;
    }

    static private boolean isBelongToLowerArea(int x, int y) {
        if (x >= -6 && x <= 6 && y >= -3 && y <= 0) return true;
        else return false;
    }

    static public boolean isBelong(int x, int y) {
        if (isBelongToUpperArea(x, y) || isBelongToLowerArea(x, y)) return true;
        else return false;
    }
}
