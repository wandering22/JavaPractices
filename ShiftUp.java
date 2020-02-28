package 堆;

public class ShiftUp {
    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void shiftUpBig(int[] arr, int sz, int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (arr[child] > arr[parent]) {
                swap(arr, child, parent);
                //继续向上更新
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }

    public static void shiftUpSmall(int[] arr, int sz, int child) {
        int parent = (child - 1) / 2;
        while (child > 0) {
            if (arr[child] < arr[parent]) {
                swap(arr, child, parent);
                //继续向上更新
                child = parent;
                parent = (child - 1) / 2;
            } else {
                break;
            }
        }
    }
}



