import java.util.Arrays;

public class Lesson2 {
    public static void printThreeWords() {
        System.out.println();
        String s1 = "Orange";
        String s2 = "Banana";
        String s3 = "Apple";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    public static void checkSumSign() {
        int a = 4;
        int b = -4;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 3;
        int b = -4;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;

        return sum >= 10 && sum <= 20;
    }

    public static void numberLine(int a, int b) {
        System.out.println(isSumInRange(a, b));
    }

    public static void numberValue() {
        int a = 0;
        if (a <= -1) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    public static boolean isIntegerNumber(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void returnNumber(int a) {
        System.out.println(isIntegerNumber(a));
    }

    public static void stringAndNumber(String text, int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int year) {
        if (((year % 400) == 0) || (year % 4 == 0)) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }

    public static void years(int year) {
        System.out.println(isLeapYear(year));
    }

    public static void array() {
        int[] arr = {0, 0, 0, 0, 1, 1, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayMultiplication() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arraySquare() {
        int[][] arr = new int[7][7];
        for (int i = 0; i < 7; i++) {
            arr[i][i] = 1;
            arr[i][7 - i - 1] = 1;
        }
        for (int i = 0; i < 7; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    public static int[] arrayLen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}



