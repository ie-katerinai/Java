/*
 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в котрый передайте заполненный выше массив и с помощью Set 
вычислите процент уникальных значений в данном массиве и верните его в виде 
числа с плавающей точкой.

Для вычисления процента используйте формулу:
процент уникальных чисел = кол-во уникальных чисел * 100/ общее кол-во чисел в массиве
 */

package Seminars.Seminar_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {
        int count = 1000;
        ArrayList<Integer> list = printArray(count);
        System.out.println(list);
        System.out.println(percentageUniqueNumbers(list ));

    }

    public static ArrayList<Integer> printArray(int count) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(1000);
        for (int i = 0; i <= count; i++) {
            arrayList.add(new Random().nextInt(25));
        }
        return arrayList;
    }

    public static Double percentageUniqueNumbers(ArrayList<Integer> list) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 1000; i++) {
            set.add(list.get(i));
            System.out.println(set);

        }
        Double percentageset = set.size() * 100.0 / list.size();
        return percentageset;

    }
}
