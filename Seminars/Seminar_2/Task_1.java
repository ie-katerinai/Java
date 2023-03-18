// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N, 
// которая состоит из чередующихся символов c1 и c2, начиная с c1.


package Seminars.Seminar_2;

import java.util.Scanner;

/**
 * Program
 */
public class Task_1 {
    private static char getChar(Scanner scanner, String message){
        System.out.print(message);
        char symbol = scanner.nextLine().charAt(0);
        return symbol;
    }
    private static String generateString(int length, char symbol1, char symbol2){
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<length/2;i++)
            builder.append(new char[]{symbol1,symbol2});
        return builder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of string: ");
        int length = scanner.nextInt();
        scanner.nextLine(); //пропускаем разделитель, оставшийся в потоке после ввода числа
        char symbol1 = getChar(scanner, "Enter first symbol of string: ");
        char symbol2 = getChar(scanner, "Enter last symbol of string: ");
        System.out.printf("Your result string: %s", generateString(length, symbol1, symbol2));
        scanner.close();
    }
}