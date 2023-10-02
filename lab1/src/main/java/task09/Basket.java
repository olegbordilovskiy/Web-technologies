package task09;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public double GetBallsWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight+=ball.GetWeight();
        }
        return weight;
    }
    public int GetBallsAmount(String color){
        int amount = 0;
        for (Ball ball:balls){
            if (ball.GetColor().equalsIgnoreCase(color)){
                amount++;
            }
        }
        return amount;
    }

    public void AddBall(Ball ball){
        balls.add(ball);
    }
}
