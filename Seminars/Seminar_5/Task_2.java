/*
 * Даны две строки? написать метод? который вернет true? если эти строки являются 
 * изофорными и false, если нет. Строки изоморфны, если одну букыу в первом слове 
 * можно заменить на некоторую букву во втором слове, при этом:
 * 
 * 1) повторяющиеся буквы одного слова меняются на одну и ту же букву 
 * с сохранением порядка следования. Например: add - egg изоморфы.
 * 2) буква может не меняться, а остаться такой же. Например: note - code.
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 */
package Seminars.Seminar_5;

import java.util.HashMap;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = scanner.nextLine();
        System.out.println("Введите второе слово: ");
        String secondWord = scanner.nextLine();
        if (firstWord.length() != secondWord.length())
        System.out.println("не изоморфные");
        else {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        checkingCount(map1, firstWord);
        checkingCount(map2, secondWord);
        
        // System.out.println(map1.hashCode());
        // System.out.println(map2.hashCode());
        System.out.println(map1.equals(map2));
        }
        scanner.close();
        }

    public static void checkingCount(HashMap<Integer, Integer> map1, String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
        int pos = text.indexOf(text.charAt(i));
        if (pos != -1) {
        if (pos < i) {
        map1.put(i, map1.get(pos));
        } else {
        map1.put(i, count++);
        }
        } else {
        map1.put(i, count++);
        }
        
        }
        System.out.println(map1);
        }

}
// второй вариант 
/* 
private static Boolean getCheckIzo(String text1, String text2)
{
Boolean result = false;
if (text1.length() != text2.length()) return false;

HashMap<Character, Integer> charText1 = new HashMap<>();
HashMap<Character, Integer> charText2 = new HashMap<>();

// Заполнение словарей
for (int i = 0; i < text1.length(); i++)
{
if (charText1.containsKey(text1.charAt(i)))
charText1.replace(text1.charAt(i), charText1.get(text1.charAt(i)) + 1);
else 
charText1.put(text1.charAt(i), 1);

if (charText2.containsKey(text2.charAt(i)))
charText2.replace(text2.charAt(i), charText2.get(text2.charAt(i)) + 1);
else 
charText2.put(text2.charAt(i), 1);
}

// печать словарей
System.out.println(charText1);
System.out.println(charText2);

if (charText1.size() == charText2.size()) result = true;
// добавить проверку по значениям в словаре

return result;
}
*/