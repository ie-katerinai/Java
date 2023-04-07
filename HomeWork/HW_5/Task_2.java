/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */

package HomeWork.HW_5;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    public static void main(String[] args) {
        Map<String, Integer> list = new HashMap<>();
        putValue(list, "Иван Иванов");
        putValue(list, "Светлана Петрова");
        putValue(list, "Кристина Белова");
        putValue(list, "Анна Мусина");
        putValue(list, "Анна Крутова");
        putValue(list, "Иван Юрин");
        putValue(list, "Петр Лыков");
        putValue(list, "Павел Чернов");
        putValue(list, "Петр Чернышов");
        putValue(list, "Мария Федорова");
        putValue(list, "Марина Светлова");
        putValue(list, "Мария Савина");
        putValue(list, "Мария Рыкова");
        putValue(list, "Марина Лугова");
        putValue(list, "Анна Владимирова");
        putValue(list, "Иван Мечников");
        putValue(list, "Петр Петин");
        putValue(list, "Иван Ежов");
        System.out.println();
        list.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);

    }

    public static void putValue(Map<String, Integer> list, String fio) {
        String name = fio.substring(0, fio.indexOf(" "));
        if (!list.containsKey(name)) {
            int count = 1;
            list.put(name, count);

        } else {
            int count = list.get(name);
            count++;
            list.put(name, count);
        }

    }

    public static void sortList() {

    }

}
