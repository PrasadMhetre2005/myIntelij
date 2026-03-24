package DSAbyShraddha.Recursion;

public class SortingByRecursion {
}
class Main {
    public static void fun2(int[] arr, int start_index, int end_index) {
        if (start_index >= end_index)
            return;
        int min_index;
        min_index = minIndex(arr, start_index, end_index);
        int temp = arr[start_index];
        arr[start_index] = arr[min_index];
        arr[min_index] = temp;
        fun2(arr, start_index + 1, end_index);
    }
    static int minIndex(int[] arr, int start, int end) {
        int min = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }



    void BubbleSort(int[] arr, int n) {
        if (n == 1)
            return;

        int count = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        BubbleSort(arr, n - 1);
    }
}
