package sort;

public class MergeSort {
    public static void sort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        merge(arr, left, mid, right);

    }

    public static void merge(int[] arr, int left, int mid, int right) {
       int[] temp = new int[right - left + 1];
       int i = left;
       int j = mid +1 ;
       int k = 0;
       while (i <= mid && j <= right) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
       }

       while (i <= mid) {
           temp[k++] = arr[i++];
       }

       while (j <= right) {
           temp[k++] = arr[j++];
       }

       for (i = 0; i < temp.length; i++) {
           arr[left + i] = temp[i];
       }

    }



    public static void warp(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
