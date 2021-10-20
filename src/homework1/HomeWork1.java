package homework1;
//Task 1
public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // Task 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task 3
    private static void checkSumSign() {
        int a = 4, b = -4;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task 4
    private static void printColor() {
        int value = 99;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");

        }
    }

    // Task 5
    private static void compareNumbers() {
        int a = 4, b = 5;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

