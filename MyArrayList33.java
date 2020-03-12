public class MyArrayList33<E> {
        private E[] array;
        private int size;

        public MyArrayList33() {
// 泛型类型无法直接创建数组，具体的见下面的注意事项
            array = (E[])new Object[16];
            size = 0;
        } // 尾插
        public void add(E e) {
            array[size++] = e;
        } // 尾删
        public E remove() {
            E element = array[size - 1];
            array[size - 1] = null; // 将容器置空，保证对象被正确释放
            size--;
            return element;
        }


    }

