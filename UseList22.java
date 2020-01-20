package 演示接口的使用;

public class UseList22 {
    public static MyList selectYiFang() {
        return new MyLinkedList();
    }

    public static void main(String[] args) {
        MyList list = selectYiFang();
        list.pushFront(1);
        list.pushFront(2);
        list.popFront();
    }
}
