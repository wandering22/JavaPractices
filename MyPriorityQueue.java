package 堆;

import 堆.ShiftDown;
import 堆.ShiftUp;

import java.util.Arrays;

public class MyPriorityQueue {

        // 演示作用，不再考虑扩容部分的代码
        private int[] array = new int[100];
        private int size = 0;

        public void offer(int value){
         if(size == array.length){
            array = Arrays.copyOf(array, array.length *  2);
        }        //  1.  尾插        //  2.  向上调整
                array[size++] = value;
        ShiftUp.shiftUpSmall(array, size, size - 1);
    }


        public int poll() {
            int oldValue = array[0];
            array[0] = array[--size];
            ShiftDown.shiftDown(array, size, 0);
            return oldValue;
        }

        public int peek() {
            return array[0];
        }
    }

