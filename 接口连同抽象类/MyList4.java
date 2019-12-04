package 接口连同抽象类;

public interface MyList4 {
    void pushFront(int element);
    void pushBack(int element);
    void insert(int index,int element);
}

abstract class AbstractList implements MyList4{
    protected int size;

    public void pushFront(int element){
        insert(0,element);
    }
    public void pushBack(int element) {
        insert(size, element);
    }
}

class MyArrayList extends AbstractList{
    public void insert(int index,int element){

    }
}

class MyLinkedList extends AbstractList{
    public void insert(int index,int element){

    }
}
