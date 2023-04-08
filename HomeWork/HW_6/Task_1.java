package HomeWork.HW_6;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Notebook note1 = new Notebook("Apple", "MacBook Pro Air", "серый", 13, 1345, "M1 3.2 GHz", 8, 1000, 2022);
        Notebook note2 = new Notebook("HUAWEI", "MateBook", "черный", 14, 1710, "Intel Core i7 - 6650U", 16, 512, 2022);
        Notebook note3 = new Notebook("Samsung", "NP300N7A", "бежевый", 15, 1690, "Intel Core i3", 4, 512, 2020);
        Notebook note4 = new Notebook("TECNO", "MegaBook", "серебристый", 15, 1560, "Intel Core i3", 12, 256, 2023);
        Notebook note5 = new Notebook("Lenovo", "ThinkPad X240", "черный", 12, 1200, "Intel Core i5", 8, 256, 2022);
        note1.setPrice(109000.00);
        note2.setPrice(56755.00);
        note2.setDiscont(20);
        note3.setPrice(56000.00);
        note4.setPrice(27900.00);
        note5.setPrice(44550.00);
        note3.setDiscont(10);
        note1.changeStatus("order");
        note1.installOperationSystem("MacOS");

        HashMap<Integer, Notebook> catalog = new HashMap<>();
        catalog.put(001, note1);
        catalog.put(002, note2);
        catalog.put(003, note3);
        catalog.put(004, note4);
        catalog.put(005, note5);

        searchMenu(catalog);
    }

    public static void searchMenu(HashMap<Integer, Notebook> map) {
        Scanner scan = new Scanner(System.in);
        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "Диагональ");
        filter.put(2, "Производитель");
        filter.put(3, "Цвет");
        filter.put(4, "Объем преативной памяти");
        filter.put(5, "Цена");
        filter.put(6, "Объем памяти");
        filter.put(7, "Год выпуска");
        System.out.println("Выберите критерий поиска:" + filter);
        int number = Integer.parseInt(scan.nextLine());
        switch (number) {
            case 1:
                int minValue1 = minValue();
                int maxValue1 = maxValue();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().screenSize >= minValue1 && search.getValue().screenSize <= maxValue1)
                        search.getValue().printSpecification();
                }
                break;
            case 2:
                System.out.println("введите значение: ");
                String value2 = scan.nextLine();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().manufacture.equals(value2))
                        search.getValue().printSpecification();
                }
                break;
            case 3:
                System.out.println("введите значение: ");
                String value3 = scan.nextLine();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().color.equals(value3))
                        search.getValue().printSpecification();
                }
                break;
            case 4:
                int minValue4 = minValue();
                int maxValue4 = maxValue();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().RAM >= minValue4 && search.getValue().RAM <= maxValue4)
                        search.getValue().printSpecification();
                }
                break;
            case 5:
                int minValue5 = minValue();
                int maxValue5 = maxValue();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().price >= minValue5 && search.getValue().price <= maxValue5)
                        search.getValue().printSpecification();
                }
                break;
            case 6:
                int minValue6 = minValue();
                int maxValue6 = maxValue();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().diskSize >= minValue6 && search.getValue().diskSize <= maxValue6)
                        search.getValue().printSpecification();
                }
                break;
            case 7:
                int minValue7 = minValue();
                int maxValue7 = maxValue();
                for (Entry<Integer, Notebook> search : map.entrySet()) {
                    if (search.getValue().year >= minValue7 && search.getValue().year <= maxValue7)
                        search.getValue().printSpecification();

                }
                break;
            default:
                System.out.println("Ничего не найдено");
        }
    }

    public static int minValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимальное значение:");
        int minValue = Integer.parseInt(scan.nextLine());
        return minValue;
    }

    public static int maxValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите максимальное значение:");
        int maxValue = Integer.parseInt(scan.nextLine());
        return maxValue;
    }

}
