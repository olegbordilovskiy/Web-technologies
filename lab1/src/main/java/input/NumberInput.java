package input;

import java.util.Scanner;

public class NumberInput {
    private Scanner scanner;

    public NumberInput() {
        this.scanner = new Scanner(System.in);
    }

    public double getNumder() {

        double num;
        while (true) {
            try {
                System.out.println("Введите число");
                num = scanner.nextDouble();
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Ошибка: неверный ввод");
                scanner.nextLine();
            }

        }
        return num;
    }
}
