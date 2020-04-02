package 使用自定义的标志通知停止;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("主线程 id: " + main.getId());
        Condition condition = new Condition();

        B b = new B(condition);
        // 定义变量并传入引用，使得 B 线程看的条件和 main 修改的条件
        // 是同一个对象
        // B 线程才能看到我的修改

        b.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("随便输入什么，都会让子线程停止挖煤");
        scanner.nextLine();

        // 通过修改 condition 引用指向的对象中的 running 为 false
        // 使得 B 线程看到的 condition.running 也是 false
        // 让 B 线程退出循环
        // 表现 让 B 下来了
        condition.running = false;
    }
}
