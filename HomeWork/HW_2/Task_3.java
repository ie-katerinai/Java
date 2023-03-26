/* Дана json-строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, 
создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */
package HomeWork.HW_2;

import java.util.Scanner;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class Task_3 {
    public static void main(String[] args) {
        String file = "/Users/evahome/Documents/Java/HomeWork/HW_2/students_list.json";
        String json = readFile(file);
        String newJson = formatString(json);
        String[] stringArray = createArrayFromJson(newJson);
        makeStringFromArray(stringArray);
    }

    public static String formatString(String formatedText) {
        String text = formatedText.replaceAll("[^0-9a-zA-Zа-яА-Я:,]", "");
        return text;
    }

    public static String readFile(String fileName) {
        String fileString = "";
        try {
            Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
            fileString = scanner.useDelimiter("\\A").next();
            scanner.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        return fileString;
    }

    public static String[] createArrayFromJson(String text) {
        String[] stringArray = text.toString().split(",");
        String[] array = new String[stringArray.length];
        int i = 0;
        for (String word : stringArray) {
            int position = word.indexOf(":");
            String value = word.substring(position + 1);
            array[i] = value;
            i++;
        }
        return array;
    }

    public static void makeStringFromArray(String[] stringArray) {
        StringBuilder file = new StringBuilder();
        for (int i = 0; i < stringArray.length; i = i + 3) {
            file.append("Студент ").append(stringArray[i]).append(" получил ").append(stringArray[i+1]).append(" по предмету ").append(stringArray[i+2]).append(". ");
        }
        System.out.println(file);
    }
}