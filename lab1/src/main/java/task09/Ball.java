package task09;

public class Ball {
    private String color;
    private double weight;

    public Ball(){
        this.color = "unknown";
        this.weight = 0;
    }
    public Ball(String color){
        this.color = color;
        this.weight = 0;
    }
    public Ball(String color, int weight){
        this.color = color;
        this.weight = weight;
    }
    public double GetWeight(){
        return this.weight;
    }
    public String GetColor(){
        return this.color;
    }
}
