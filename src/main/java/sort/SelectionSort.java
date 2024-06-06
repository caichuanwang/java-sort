package sort;

public class SelectionSort  {
    public static int[] selection(int[] source){
        int n = source.length;
        for (int i = 0; i < n; i++) {
            for (int j = i +1; j < n - 1; j++) {
                if (source[j+1] > source[j]) {
                    int temp = source[i];
                    source[i] = source[j];
                    source[j]= temp;
                }
            }
        }
        return source;
    }
}

