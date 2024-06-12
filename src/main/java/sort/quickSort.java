package sort;

public class quickSort {
    public static void sort (int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        int pivot = partition(arr, left, right);
        sort(arr, left, pivot  );
        sort(arr, pivot + 1, right);
    }

    public static int partition (int[] arr, int low, int high){
        int i = low, j = high;
        while (i < j){
            while (i < j && arr[j] >= arr[low])
                j--;
            while (i < j && arr[i] <= arr[low])
                i++;
            warp(arr, i, j);
        }
        warp(arr,i,low);
        return i;
    }



    public static void warp (int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
