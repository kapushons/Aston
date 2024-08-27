public class ArrayProcesses {
    public static int cubSumma(String[][] arr) throws MiArraySizeException, MyArrayDataException {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MiArraySizeException("Размер массива должен быть 4х4");
        }
        int summa = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    summa += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные: (" + i + "," + j + ")", i, j);
                }
            }
        }
        return summa;
    }
}
