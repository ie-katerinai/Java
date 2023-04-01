package HomeWork.HW_3;

import java.util.ArrayList;


public class Task_3 {
    public static void main(String[] args) {
        int array[] = { 9, 1, 3, 15, 4, 14, 7, 6, 8, 11 };
        ArrayList<Integer> list = createListFromArrayList(array);
        removeEvenElements(list);
    }

    public static ArrayList createListFromArrayList(int[] array) {
        ArrayList<Integer> listFromArray = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            listFromArray.add(array[i]);
        }
        return listFromArray;
    }
    
    public static void removeEvenElements(ArrayList<Integer> list) {
        int i = 0;
        while(i < list.size()){
            if (list.get(i) % 2 == 0){
                list.remove(i);
            }
            else i++;
        }
        System.out.println(list.toString());
    }
}
