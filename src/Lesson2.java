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
}
