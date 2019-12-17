import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class MyStack {
    //用队列实现栈

    Queue<Integer> queue;
     public MyStack(){
         queue=new LinkedList<>();
        // Queue<Integer> queue=new LinkedList<>();
    }
   //static Queue<Integer> queue=new LinkedList<>();

//    public  void MyStack(String s){
//
//
//        for(int i=0;i<s.length();i++) {
//            int ss=s.charAt(i);
//            queue.offer(ss);
//            queue.poll();
//            for(int j=0;j<s.length()-1;j++) {
//                queue.offer(ss);
//            }
//
//        }
//    }

    public  void push(int element){

           // int ss=s.charAt(i);
            queue.offer(element);
       // return (LinkedList) queue;
    }

    public  int pop() {
        // for(Integer i:s){
//        for (int i = 0; i < queue.size(); i++) {
//            queue.poll();
//            for (int j = 0; j < queue.size() - 1; j++) {
//                queue.offer(j);
//            }
        int sz=queue.size();
        while(sz>1){
            queue.offer(queue.poll());
            sz--;
        }

        return queue.poll();
       // return (LinkedList) queue;
    }

    public  int top(){
        int sz=queue.size();
        while(sz>1){
            queue.offer(queue.poll());

        }
        int ret=queue.poll();
        queue.offer(ret);
        return ret;
    }

    public boolean empty(){
         return queue.isEmpty();
    }

    public static void main(String[] args) {

        //Stack<Integer> s=new LinkedList<>();
        //Queue<Integer> q=new LinkedList<>();
        // s.push(1);


    }
}
