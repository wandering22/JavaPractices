public class MyCircularQueue {

    //实现循环队列

    int [] array;
    int front;
    int rear;     //队尾元素的下一个位置
    int size;

    public MyCircularQueue(int k){
        array=new int[k+1];
        front=rear=0;
        size=0;
    }

    public boolean enQueue(int value) {                //向循环队列插入一个元素。如果成功插入则返回真
        if(isFull()){
            return false;
        }
        array[rear++]=value;

        //判断位置是否越界，更新位置
        //rear=rear%array.length;
        if(rear==array.length){
            rear=0;
        }
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {           //从循环队列中删除一个元素。如果成功删除则返回真
        if(isEmpty()){
            return false;
        }
        //头删
        front++;
        front=front%array.length;   //0     满：(rear+1) %length==front
        size--;
        return true;

    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return array[front];

    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear==0){
            return array[array.length-1];
        }
        return array[rear-1];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front==rear;

    }
    public int size(){
        return size;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (rear+1)%array.length==front;

    }

    public static void main(String[] args) {


        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        circularQueue.enQueue(1);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(3);  // 返回 true
        System.out.println(circularQueue.enQueue(4));  // 返回 false，队列已满

        System.out.println(circularQueue.size);     //3
        System.out.println(circularQueue.Rear());  // 返回 3
        System.out.println( circularQueue.isFull()); // 返回 true
        System.out.println(circularQueue.deQueue()); // 返回 true
        System.out.println( circularQueue.enQueue(4));  // 返回 true
        System.out.println(circularQueue.Rear());  // 返回 4
    }

}
