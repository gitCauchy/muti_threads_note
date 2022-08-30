package com.cauchy.one;

public class MyThread extends Thread{
    // 重写父类 run 方法
    @Override
    public void run() {
        System.out.println("This message is printed by child thread");
    }

    public static void main(String[] args) {
        System.out.println("This message is printed by parent thread");
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
