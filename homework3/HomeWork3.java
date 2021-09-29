public class HomeWork3 {
    public static void main(String args[]) {
        arrFrst();
        arr1to100(100);
        arrChange();
        arrMtrx();
        arrIV(7, 0);
        arrMinMax();
        arrSum();
        System.out.println(arrSum());
    }

    // Task 1
    public static void arrFrst() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print("|" + arr1[i] + "|");
        }
        System.out.println();
    }

    // Task 2
    public static void arr1to100(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print("|" + arr[i] + "|");
        }
        System.out.println();
    }

    // Task 3
    public static void arrChange() {
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i] * 2;
            }
            System.out.print("|" + arr3[i] + "|");
        }
        System.out.println();
    }

    // Task 4
    public static void arrMtrx() {
        int[][] arr4 = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0,},
                {0, 0, 0, 0,}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                }
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Task 5
    public static void arrIV(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(i + "- " + arr[i] + " | ");
        }
        System.out.println();
    }

    // Task 6
    public static void arrMinMax() {
        int[] arr6 = {9, 8, 5, 23, 666, 777};
        int max = arr6[0];
        int min = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
        }
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Min - " + min);
        System.out.println("Max - " + max);
        System.out.println();
    }

    // Task 7
    public static boolean arrSum() {
        int[] arr7 = {44, 6, 6, 32};
        int lft = 0;
        int rght = 0;
        for (int i = 0; i < arr7.length; i++) {
            lft += arr7[i];
        }
        for (int i = 0; i < arr7.length; i++) {
            rght += arr7[i];
            if (rght == lft - rght) {
                return true;
            }
        }
        return false;
    }

    // Task 8
}