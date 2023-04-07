/* Создать структуру для хранения номеров паспортов и фамилий сотрудников организации.
123456 Иванов
321545 Васильев
745338 Петрова
343542 Иванов
743865 Петрова
746255 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
*/
package Seminars.Seminar_5;

import java.util.HashMap;
import java.util.Map.Entry;

public class Task_1_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(123456, "Иванов");
        employees.put(321545, "Васильев");
        employees.put(745338, "Петрова");
        employees.put(343542, "Иванов");
        employees.put(743865, "Петрова");
        employees.put(746255, "Иванов");
        for (Entry<Integer, String> pair : employees.entrySet()) {
            if(pair.getValue().equals("Иванов"))
                System.out.println(String.format("%d %s", pair.getKey(), pair.getValue()));
            
        }
    }
}
