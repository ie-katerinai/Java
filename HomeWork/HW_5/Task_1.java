// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package HomeWork.HW_5;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Map<String, String> list = new HashMap<>();
        putValue(list, "Иванов", "123456789");
        putValue(list, "Васильев", "987654321");
        putValue(list, "Петрова", "975312468");
        putValue(list, "Иванов", "135798642");
        putValue(list, "Петрова", "125689347");
        putValue(list, "Иванов", "463875912");
        System.out.println("Введите фамилию: ");
        Scanner scanner = new Scanner(System.in);
        String searchNumberForName = scanner.nextLine();
        int flag = searchName(list, searchNumberForName);
        if (flag == -1)
            System.out.println("Фамилия не найдена");
        scanner.close();
    }

    public static void putValue(Map<String, String> list, String key, String value) {
        if (list.containsKey(key)) {
            list.put(key, list.get(key) + ", " + value);
        } else
            list.put(key, value);
    }

    public static int searchName(Map<String, String> list, String name) {
        int result = -1;
        for (Entry<String, String> pair : list.entrySet()) {
            if (pair.getKey().equals(name)) {
                System.out.println(String.format("%s %s", pair.getKey(), pair.getValue()));
                result = 0;
                break;
            } else
                result = -1;
        }
        return result;
    }
}