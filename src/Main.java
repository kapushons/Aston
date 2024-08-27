public class Main {
    public static void main(String[] args) {
        String[][] array = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

        try {
            int summa = ArrayProcesses.cubSumma(array);
            System.out.println("Сумма массива: " + summa);
        } catch (MiArraySizeException e) {
            System.out.println("Исключение размера массива - " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Исключение данных в этом месте - (" + e.getRow() + "," + e.getCol() + "): " + e.getMessage());
        }
    }
}
