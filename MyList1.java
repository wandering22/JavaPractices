﻿
public interface MyList1 {
    void pushFront(int element);
    void pushBack(int element);
    void insert(int index, int element);
}

abstract class AbstractList implements MyList {
    protected int size;

    @Override
    public void pushFront(int element) {
        insert(0, element);
    }

    @Override
    public void pushBack(int element) {
        insert(size, element);
    }
}

class MyArrayList extends AbstractList {
    @Override
    public void insert(int index, int element) {
    }
}

class MyLinkedList extends AbstractList {
    @Override
    public void insert(int index, int element) {
    }
}
