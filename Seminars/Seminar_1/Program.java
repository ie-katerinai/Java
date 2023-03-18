import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.printf("Привет, " + text + "!");
        scanner.close();
    }
}
