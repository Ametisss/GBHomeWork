package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        PrintThreeWords();
        checkSumSign();
        printColor();
        compareNumber();
    }

    public static void PrintThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    public static void checkSumSign() {
        int a = -5;
        int b = -7;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        }
        if (result < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int value = 56;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 1 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 101) {
            System.out.println("Зеленый");
        }

    }
    public static void compareNumber() {
        int a = 22;
        int b = 33;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else if (a <= b) {
            System.out.println("a <= b");
        }
    }
}


