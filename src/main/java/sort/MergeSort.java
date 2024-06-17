package sort;

public class MergeSort {
    public static void sort(int[] arr) {

    }

    public static void merge(int[] arr, int left, int mid, int right) {
       int[] temp = new int[right - left + 1];
    }



    public static void warp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
