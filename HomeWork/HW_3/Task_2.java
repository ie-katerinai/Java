// Пусть дан произвольный список целых чисел, удалить из него чётные числа
package HomeWork.HW_3;

public class Task_2 {

    public static void main(String[] args) {
        int array[] = { 9, 1, 3, 15, 2, 4, 7, 6 };
        System.out.println(countOdd(array));
        System.out.println();
        int[] newArray = deleteEvenNumbers(array);
        printArray(newArray);
    }

    public static int countOdd(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] deleteEvenNumbers(int[] array) {
        int[] finalArray = new int[countOdd(array)];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                finalArray[j] = array[i];
                j++;
            }
        }
        return finalArray;

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
