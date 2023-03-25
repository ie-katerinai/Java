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

import java.io.*;
import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task_3 {
    public static void main(String[] args) {
        String file = "/Users/evahome/Documents/Java/HomeWork/HW_2/students_list.json";
        String json = readFile(file);
        formatString(json);
        System.out.println(json);
        HashMap<String, String> dictionary = new HashMap();
        dictionary = createDictionaryFromJson(json);
        System.out.println(dictionary.values());
        // String textReplace = json.replaceAll("\"", "");
        // String[] textArray = textReplace.split(",");
        // StringBuilder requestText = new StringBuilder(req);
        //
        // }
        // }
        // requestText.replace(requestText.lastIndexOf(" AND"), requestText.length(),
        // "");
        // System.out.println(requestText);
    }

    public static void formatString(String formatedText) {
        formatedText.replaceAll("[^0-9a-zA-Z:,]", "");
    }

    public static String readFile(String fileName) {
        String fileString = "";
        try {
            Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
            fileString = scanner.useDelimiter("\\A").next();
            scanner.close();
            // return fileString;
        } catch (IOException e) {
            System.out.println(e);
        }
        return fileString;
    }

    public static HashMap createDictionaryFromJson(String text) {
        HashMap<String, String> dict = new HashMap<>();
        String[] stringArray = text.toString().split(",");
        for (String word : stringArray) {
            int position = word.indexOf(":");
            String key = word.substring(0, position);
            String value = word.substring(position + 1);
            dict.put(key, value);
        }
        return dict;
    }

    public static void makeStringFromArray(String[] stringArray) {
        StringBuilder file = new StringBuilder();
        for (String word : stringArray) {
            int position = word.indexOf(":");
            file.append(word.substring(0,
                    position)).append("=\'").append(word.substring(position + 1))
                    .append("\' AND");
        }
    }
}