// Напишите метод, который сжимает строку.
// Ввод: aaaabbbcdd
// Вывод: a4b3cd2

package Seminars.Seminar_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("введите строку");
        String inputText = scanner.next();
            
            System.out.println(Rle(fff));
        }
        public static String Rle(String str1) {
            System.out.println(str1);
            StringBuilder builder = new StringBuilder();
            int counter = 0;
            char currentChar = 0;
            for (int index = 0; index < str1.length(); index++) {
                if (currentChar != str1.charAt(index)) {
                    if (counter > 1) builder.append(counter); 
                    builder.append(str1.charAt(index));
                    counter = 1;
                    currentChar =str1.charAt(index);
                }  
                else { 
                    counter ++;
                }
            }
            builder.append(counter);
            return builder.toString();
        }
}