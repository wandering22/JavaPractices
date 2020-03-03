import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void test1()
    {
        int[]  arr = {120,9,3,2,10,35,89,0,7,12};
        int[]  copy = arr.clone();
        int[]  copy2 = arr.clone();
        int[]  copy3 = arr.clone();

        System.out.println(Arrays.toString(arr));
        InsertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(copy);
        System.out.println(Arrays.toString(copy));
        ShellSort.shellSort(copy2);
        System.out.println(Arrays.toString(copy2));
        SelectSort.selectSort(copy3);
        System.out.println(Arrays.toString(copy3));

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

        long begin = System.nanoTime();
        InsertSort.insertSort(arr);
        long end = System.nanoTime();
        System.out.printf("insertSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        ShellSort.shellSort(arr2);
        end = System.nanoTime();
        System.out.printf("shellSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        SelectSort.selectSort(arr3);
        end = System.nanoTime();
        System.out.printf("selectSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);


        System.out.println("数据已经有序： ");
        begin = System.nanoTime();
        InsertSort.insertSort(arr);
        end = System.nanoTime();
        System.out.printf("insertSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        ShellSort.shellSort(arr2);
        end = System.nanoTime();
        System.out.printf("shellSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

        begin = System.nanoTime();
        SelectSort.selectSort(arr3);
        end = System.nanoTime();
        System.out.printf("selectSort time :  %.4fms\n", (end - begin) * 1.0 / 1000 / 1000);

    }


    public static void main(String[] args) {
        //test1();
        test2();
    }
}
