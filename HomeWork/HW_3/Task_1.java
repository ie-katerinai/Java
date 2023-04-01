package HomeWork.HW_3;

public class Task_1 {
    public static void main(String[] args) {
        int array[] = { 9, 1, 3, 15, 2, 4, 7, 6 };

        mergeSort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

    }

    static void merge(int array[], int init, int midle, int last) {
        int countA = midle - init + 1;
        int countB = last - midle;

        int arrayA[] = new int[countA];
        int arrayB[] = new int[countB];

        for (int i = 0; i < countA; i++)
        arrayA[i] = array[init + i];
        for (int j = 0; j < countB; j++)
        arrayB[j] = array[midle + 1 + j];

        int i = 0, j = 0;
        int k = init;
        while (i < countA && j < countB) {
            if (arrayA[i] <= arrayB[j]) {
                array[k] = arrayA[i];
                i++;
            } else {
                array[k] = arrayB[j];
                j++;
            }
            k++;
        }
        while (i < countA) {
            array[k] = arrayA[i];
            i++;
            k++;
        }
        while (j < countB) {
            array[k] = arrayB[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int arr[], int init, int last) {
        if (init < last) {
            int midle = (init + last) / 2;
            mergeSort(arr, init, midle);
            mergeSort(arr, midle + 1, last);
            merge(arr, init, midle, last);
        }
    }

}
