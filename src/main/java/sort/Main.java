package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] source = new int[]{3,5,2,7,1,4,1};
//        int[] resp = SelectionSort.selection(source);
//        int[] resp = InsertSort.sort(source);
        int[] resp = Bubble.sort(source);
        System.out.println(Arrays.toString(resp));
    }

}