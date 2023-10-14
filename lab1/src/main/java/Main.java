import task12.Book;

public class Main {
    static String[] colorsArray = new String[]{"Red", "Green", "Blue"};
    public static void main(String[] args){
//        Basket basket = new Basket();
//        Random random = new Random();
//        int ballsAmount  = random.nextInt(10) + 5;
//        for (int i = 0; i < ballsAmount; i++) {
//            int weight = random.nextInt(9) + 1;
//            String color = colorsArray[random.nextInt(colorsArray.length)];
//            Ball ball = new Ball(color,weight);
//            basket.AddBall(ball);
//        }
//        double ballsWeight = basket.GetBallsWeight();
//        int blueBallsAmount = basket.GetBallsAmount("Blue");
//        System.out.printf("Вес всех шариков: %.2f\nКоличество синих шаров: %d", ballsWeight, blueBallsAmount);

        Book book = new Book("goodfellas","max payne", 100, "fjhdf");
        book.equals(book);
        System.out.println(book.toString());

    }
}
