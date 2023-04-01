// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package HomeWork.HW_4;

import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<String> positions = new LinkedList<>();
        String str1 = new String("First");
        String str2 = new String("Second");
        String str3 = new String("Third");
        String str4 = new String("Fourth");

        positions.add(str1);
        positions.add(str2);
        positions.add(str3);
        positions.add(str4);

        System.out.println(positions);
        positions.toArray();

        System.out.println(reverseLinkedList(positions));
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reversePosition = new LinkedList<>();
        int size = list.size();
        while (size > 0) {
            String last = list.getLast();

            reversePosition.add(last);
            list.remove(size - 1);
            size--;
        }
        return reversePosition;

    }
}
