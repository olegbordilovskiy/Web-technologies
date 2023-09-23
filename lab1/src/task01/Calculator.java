package task01;
import java.lang.Math;

public class Calculator {
    public static float Result(float x, float y){
        return Numerator(x,y)/Denumerator(x,y)+x;
    }

    private static float Numerator(float x, float y){
        return (float)(1+Math.pow(Math.sin(x+y),2));
    }
    private static float Denumerator(float x, float y){
        return (float)(2+Math.abs(x-(2*x/(1+x*x*y*y))));
    }
}
