/*Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
n! (произведение чисел от 1 до n)
 */
package HomeWork.HW_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        System.out.println("Введите число n: ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TriangleSumm(n);
        scanner.close();
    }
    public static void TriangleSumm(int number) {
        int summ = 0;
        for (int i = 0; i <= number; i++) {
            summ = summ + i;
        }
        System.out.println(summ);
    }
}
