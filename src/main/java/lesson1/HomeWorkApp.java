package lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();

    }



    private static void compareNumbers(){
        int numA = 7;
        int numB = 25;
        if (numA >= numB) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    private static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-10, 110);
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <=100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSing() {
        int varA = 5;
        int varB = 7;
        System.out.println(varA + varB);
        int result1 = ThreadLocalRandom.current().nextInt(-5, 10);
        if (result1 >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

}