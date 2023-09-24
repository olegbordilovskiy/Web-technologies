import input.NumberInput;
import task01.Calculator;

public class Main {
    public static void main(String[] args){
        NumberInput input = new NumberInput();
        double x = input.getNumder();
        double y = input.getNumder();
        System.out.println(Calculator.Result(x,y));
    }
}
