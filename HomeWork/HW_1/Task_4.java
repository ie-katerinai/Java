/*Задано уравнение вида q + w = e, q, w, e >= 0. 
Некоторые цифры могут быть заменены знаком вопроса, 
например, 2? + ?5 = 69. 
Требуется восстановить выражение до верного равенства. 
Предложить хотя бы одно решение или сообщить, что его нет */
package HomeWork.HW_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        scanner.close();
        // System.out.println(expression);
        if (expression.isEmpty()) {
            System.out.println("Строка пустая.");
        } else {
            int[] indexes = new int[countMatch(expression)];
            System.out.println(indexes.length);
        }
    }

    public static int countMatch(String exp) {
        int indx = 0, count = 0;
        while (true) {
            indx = exp.indexOf("?", indx);
            if (indx != -1) {
                count++;
                indx++;
            } else {
                break;
            }
        }
        return count;
    }

    public static int[] indexesArray(int[] array) 
    {
        int[] result = array;
        return result;
    }
}
