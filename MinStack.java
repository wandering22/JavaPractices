import java.util.Stack;

//设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
//
//        push(x) -- 将元素 x 推入栈中。
//        pop() -- 删除栈顶的元素。
//        top() -- 获取栈顶元素。
//        getMin() -- 检索栈中的最小元素。

public class MinStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void push(int element){
        stack1.push(element);
        if(stack2.isEmpty()){
            stack2.push(element);}
        else if(element<=stack2.peek()){
            stack2.push(element);
        }
    }

    public void pop(){
        int a=stack1.peek();
        int b=stack2.peek();
       // if(stack2.isEmpty()){
        if(a==b){
            stack2.pop();
        }
        //}
        stack1.pop();
    }

    public int top(){
        if(stack1.peek()==stack2.peek()){
            stack2.pop();
        }
        int ret=stack1.peek();
    return ret;
    }

    public int getMin(){
        return stack2.peek();
    }
}
