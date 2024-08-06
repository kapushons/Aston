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
        int value = -101;
        if (value <= 0) System.out.println("Красный");
        else if (value >= 101) System.out.println("Зелёный");
        else System.out.println("Жёлтый");
    }

    public static void compareNumbers() {
        int a = 3;
        int b = -4;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public static void numberLine() {
        int a = 12;
        int b = 10;
        int c = a + b;
        if (c > 9 && c < 21) System.out.println("True");
        else System.out.println("False");
    }

    public static void numberValue() {
        int a = 0;
        if (a <= -1) System.out.println("Число отрицательное");
        else System.out.println("Число положительное");
    }

    public static void returnNumber() {
        int a = 0;
        if (a <= -1) System.out.println("True");
        else System.out.println("False");
    }

    public static void stringAndNumber() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Я люблю Астон");
        }
    }

    public static void years() {
        int a = 2077;
        if (!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0))) System.out.println(a + " - Не високосный - False");
        else System.out.println(a + " - Високосный - True");
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
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
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

    public static void arrayOneDimensional() {
    }
}

