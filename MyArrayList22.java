public class MyArrayList22<E> {
    //泛型
    private E[] array;
    //private E
    private int size;
    MyArrayList22() {
        array = (E[])new Object[10];
        size = 0;
    }
    public void add(E element) {
        array[size++] = element;
    }
    public E get(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        MyArrayList22<String> list = new MyArrayList<>();
        list.add("String");
        System.out.println(list.get(0));
    }
}
