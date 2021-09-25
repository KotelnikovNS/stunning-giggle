package homework2;

public class HomeWork2 {
    public static void main(String[] args){
        checkSum(5,6);
        positiveNegative(6);
        negative(-7);
        repeater("hello",6);
        leapYear(2025);
    }
    // Task 1
    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    //Task 2
    public static void positiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }

    //Task 3
    public static boolean negative(int a) {
        return a <= 0;
    }
    // Task 4
    public static void repeater(String text, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + text);
        }
    }
    // Task 5
    public static boolean leapYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}