// В калькулятор добавьте возможность отменить последнюю операцию.
package HomeWork.HW_4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> listCalculation = new LinkedList<>();
        mainMenu(listCalculation);
    }

    public static String mainMenu(LinkedList<Integer> listCalculation) {
        System.out.println(
                "Выбирите действие:\n1 - сделать вычисление;\n2 - вывести список последних вычислений;\n3 - удалить последнюю операцию;\n0 - выйти из программы.");
        Scanner scanner = new Scanner(System.in);
        String flag = scanner.nextLine();
        switch (flag) {
            case "1":
                int result = makeCalculation();
                System.out.println("Результат операции: " + result);
                listCalculation = addResult(listCalculation, result);
                mainMenu(listCalculation);
            case "2":
                System.out.println(listCalculation);
                mainMenu(listCalculation);
            case "3":
                deleteLastCalculation(listCalculation);
                mainMenu(listCalculation);
            case "0":
                System.out.println("Goodbye!");
                break;
        }
        return flag;
    }

    public static int makeCalculation() {
        System.out.println("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int numb_1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Введите операцию: ");
        String operator = scanner.nextLine();
        System.out.println("Введите второе число: ");
        int numb_2 = Integer.parseInt(scanner.nextLine());
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
                System.out.println("Невозвозможно совершить операцию.");
                break;
        }
        return result;
    }

    public static LinkedList<Integer> addResult(LinkedList<Integer> list, int number) {
        list.add(number);
        return list;
    }

    public static void deleteLastCalculation(LinkedList<Integer> list) {
        list.removeLast();
    }
}