/*
 Вывести все простые числа от 1 до 1000
 */
package HomeWork.HW_1;

public class Task_2 {
    public static void main(String[] args) {
        boolean simpleFlag = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i%j == 0){
                    simpleFlag = false;
                    break;
                }
                
            }
            if (simpleFlag) System.out.println(i);
            else simpleFlag = true;
        }
    }
}
