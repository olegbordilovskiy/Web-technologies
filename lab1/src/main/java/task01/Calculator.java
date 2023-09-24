package task01;
import java.lang.Math;

public class Calculator {
    public static double Result(double x, double y){
        return Numerator(x,y)/Denumerator(x,y)+x;
    }

    private static double Numerator(double x, double y){
        return (1+Math.pow(Math.sin(x+y),2));
    }
    private static double Denumerator(double x, double y){
        return (2+Math.abs(x-(2*x/(1+x*x*y*y))));
    }
}
