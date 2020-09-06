public class SynchronizedDemo {
    public void methond() { // 进入代码块会锁 this 指向对象中的锁；出代码块会释放 this 指向的对象中的锁
        synchronized (this) {

        }
    }
    public static void main(String[] args) {
        SynchronizedDemo demo=new SynchronizedDemo();
        demo.methond();

    }
}

 class SynchronizedDemo1 {
    public void methond() {
        // 进入代码块会锁 SynchronizedDemo.class 指向对象中的锁；出代码块会释放 SynchronizedDemo.class 指向的对象中的锁
        synchronized (SynchronizedDemo.class) {

        }
    }
    public static void main(String[] args) {
        SynchronizedDemo1 demo = new SynchronizedDemo1();
        demo.methond();
    } }
