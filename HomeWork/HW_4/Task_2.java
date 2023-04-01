// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.
package HomeWork.HW_4;

import java.util.LinkedList;

public class Task_2 {
    public static void main(String[] args) {
        LinkedList<String> queueList = new LinkedList<>();
        enqueue(queueList, "First");
        enqueue(queueList, "Second");
        enqueue(queueList, "Third");
        enqueue(queueList, "Fourth");

        System.out.println(queueList);
        String firstElement = dequeue(queueList);
        System.out.println(firstElement);
        System.out.println(queueList);
        firstElement = first(queueList);
        System.out.println(firstElement);
        System.out.println(queueList);
    }

    public static void enqueue(LinkedList<String> list, String element) {
        list.add(element);
    }

    public static String dequeue(LinkedList<String> list) {
        String element = list.getFirst();
        list.removeFirst();
        return element;
    }

    public static String first(LinkedList<String> list) {
        String element = list.getFirst();
        return element;
    }
}
