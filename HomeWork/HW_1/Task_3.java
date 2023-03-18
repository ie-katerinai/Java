/*Реализовать простой калькулятор */
package HomeWork.HW_1;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int numb_1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите операцию: ");
        String operator = scanner.nextLine();
        System.out.println("Введите второе число: ");
        int numb_2 = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int result = 0;
        switch (operator) {
            case "+":
                result = numb_1 + numb_2;
                break;
            case "-":
            result = numb_1 - numb_2;
            break;
            case "*":
            result = numb_1 * numb_2;
            break;
            case "/":
            result = numb_1 / numb_2;
            break;
            default:
            System.out.println("Не возвозможно совершить операцию.");
                break;
        }
        System.out.println("Результат операции: " + result);
}
    }
        
