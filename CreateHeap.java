package 堆;

import 堆.ShiftDown;

public class CreateHeap {
    //建堆
    public static void createHeap(int[] array, int size) {
        for (int i = (size - 1) / 2; i >= 0; i--) {
            ShiftDown.shiftDown(array, size, i);
        }
    }
}
