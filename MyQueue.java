
import java.util.Stack;

public class MyQueue {
    //用栈实现队列
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int element) {          //将一个元素放入队列的尾部
        stack1.push(element);
    }

    public void pop() {                    //将队列首部移除元素
        int sz=stack1.size();
        if (stack2.isEmpty()) {
            for(int i=0;i<sz;i++){
                stack2.push(stack1.pop());
            }}
        sz--;
        stack2.pop();
        //return ret;
    }

    public int peek() {            //返回队列首部的元素
        int sz=stack1.size();
        if (stack2.isEmpty()) {
            for(int i=0;i<sz;i++){
                stack2.push(stack1.pop());
            }}
        sz--;
        // stack2.pop();
        int ret = stack2.peek();
        return ret;
    }

    public boolean empty() {
        if (stack1.empty()) {
            return stack2.isEmpty();
        } else {
            return false;
        }
    }
}
