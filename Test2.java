import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void test1()
    {
        Random rdm = new Random(2020229111);
        int number = 25;
        int[] arr = new int[number];
        for(int i = 0; i <number; ++i){
            arr[i] = rdm.nextInt(10000) % 150;
        }
        int[]  copy = arr.clone();
        int[]  copy2 = arr.clone();
        int[]  copy3 = arr.clone();
        int[]  copy4 = arr.clone();
        int[]  copy5 = arr.clone();
        int[]  copy6 = arr.clone();
        int[]  copy7 = arr.clone();
        int[]  copy8 = arr.clone();
        int[]  copy9 = arr.clone();


        System.out.println(Arrays.toString(arr));
//        insertSort(arr);
//        System.out.println("insertSort\t: " + Arrays.toString(arr));
//        Arrays.sort(copy);
//        System.out.println("Arrays.sort\t: " + Arrays.toString(copy));
//        shellSort(copy2);
//        System.out.println("shellSort\t: " + Arrays.toString(copy2));
//        selectSort(copy3);
//        System.out.println("selectSort\t: " + Arrays.toString(copy3));
        HeapSort.heapSort(copy4);
        System.out.println("heapSort\t: " + Arrays.toString(copy4));
        BubbleSort.bubbleSort(copy5);
        System.out.println("bubbleSort\t: " + Arrays.toString(copy5));
        QuickSort2.quickSort(copy6, 0, copy6.length - 1);
        System.out.println("quickSort\t: " + Arrays.toString(copy6));
        QuickSortNoR.quickSortNoR(copy7);
        System.out.println("quickSortNoR\t: " + Arrays.toString(copy7));
        MergeSort.merge(copy8);
        System.out.println("mergeSort\t: " + Arrays.toString(copy8));
        MergeNoR.mergeNoR(copy9);
        System.out.println("mergeSortNoR\t: " + Arrays.toString(copy9));


    }

    public static void test2(){
        Random rdm = new Random(2020229111);
        int number = 100000;
        int[] arr = new int[number];
        for(int i = 0; i <number; ++i){
            arr[i] = rdm.nextInt();
        }
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int[] arr4 = arr.clone();
        int[] arr5 = arr.clone();
        int[] arr6 = arr.clone();
        int[] arr7 = arr.clone();
        int[] arr8 = arr.clone();


        long begin = System.nanoTime();
        //insertSort(arr);
        long end = System.nanoTime();
//        System.out.printf("insertSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
//
//        begin = System.nanoTime();
//        shellSort(arr2);
//        end = System.nanoTime();
//        System.out.printf("shellSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
//
//        begin = System.nanoTime();
//        selectSort(arr3);
//        end = System.nanoTime();
//        System.out.printf("selectSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        HeapSort.heapSort(arr4);
        end = System.nanoTime();
        System.out.printf("heapSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        BubbleSort.bubbleSort(arr5);
        end = System.nanoTime();
        System.out.printf("bubbleSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        QuickSort2.quickSort(arr6, 0, arr6.length - 1);
        end = System.nanoTime();
        System.out.printf("quickSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        QuickSortNoR.quickSortNoR(arr7);
        end = System.nanoTime();
        System.out.printf("quickSortNoR time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        MergeSort.merge(arr8);
        end = System.nanoTime();
        System.out.printf("mergeSort time\t:  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);


        System.out.println("数据已经有序： ");
        begin = System.nanoTime();
        //insertSort(arr);
        end = System.nanoTime();
//        System.out.printf("insertSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
//
//        begin = System.nanoTime();
//        shellSort(arr2);
//        end = System.nanoTime();
//        System.out.printf("shellSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
//
//        begin = System.nanoTime();
//        selectSort(arr3);
//        end = System.nanoTime();
//        System.out.printf("selectSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        HeapSort.heapSort(arr4);
        end = System.nanoTime();
        System.out.printf("heapSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        BubbleSort.bubbleSort(arr5);
        end = System.nanoTime();
        System.out.printf("bubbleSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        QuickSort2.quickSort(arr6, 0, arr6.length - 1);
        end = System.nanoTime();
        System.out.printf("quickSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        QuickSortNoR.quickSortNoR(arr7);
        end = System.nanoTime();
        System.out.printf("quickSortNoR time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        MergeSort.merge(arr8);
        end = System.nanoTime();
        System.out.printf("mergeSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);
    }


    public static void main(String[] args) {
        test1();

        //test2();
    }
}


