import java.lang.reflect.Array;
import java.util.Arrays;

public class Stack2 {
    //实现栈
    private int[] array;
    static int size;
    //int n;
    public  Stack(int n){
        array=new int[n];
         size=0;
    }

    public void push(int v){
        //扩容
        if(size==array.length){
            array= Arrays.copyOf(array,size*2);
        }
        array[size++]=v;
    }

    public void pop(){
        if(size>0){
            size--;
        }
    }

    public int  peek(){
        return array[size-1];
    }


    public int size(){
        return size;
    }

    public static boolean empty(){
        if(size==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Stack s=new Stack(2);
        System.out.println(s.size());

        System.out.println(empty());
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.size());
        System.out.println(empty());
        s.pop();
        //s.peek();
        System.out.println(s.peek());

    }
}
