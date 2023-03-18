public class Prog {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,0,9,1,1,1,1};
        int counter = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                counter ++;
                if (counter > max) max=counter;
            } else {
                counter = 0;
            }
        }
        System.out.println("Максимальное количество подряд идущих единиц = " + max);
    }
}