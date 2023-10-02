package task09;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    @Test
    void GetBallsWeight(){
        Basket basket = new Basket();
        basket.AddBall(new Ball("Red", 15));
        basket.AddBall(new Ball("Red", 2));
        basket.AddBall(new Ball("Red", 70));
        basket.AddBall(new Ball("Red", 33));
        Assertions.assertEquals(120, basket.GetBallsWeight());
    }

    @Test
    void GetBallsAmount(){
        Basket basket = new Basket();
        basket.AddBall(new Ball("Red", 15));
        basket.AddBall(new Ball("Blue", 2));
        basket.AddBall(new Ball("Blue", 70));
        basket.AddBall(new Ball("Green", 33));
        basket.AddBall(new Ball("Blue", 33));
        Assertions.assertEquals(3,basket.GetBallsAmount("Blue"));
    }
}
