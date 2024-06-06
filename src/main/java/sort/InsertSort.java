package sort;

public class InsertSort {
    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int base = arr[i];
            for (int j = i - 1; j >= 0; j -- ){
                if (arr[j] < base){
                    arr[j+1] = arr[j];
                    arr[j] = base;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
