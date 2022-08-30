package com.cauchy.one;

public class SubThread1 extends Thread {
    public SubThread1() {
        System.out.println("构造方法打印当前线程的名称：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run 方法打印当前线程名称：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SubThread1 subThread1 = new SubThread1();
        subThread1.start();
    }
}
