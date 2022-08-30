package com.cauchy.one;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This message is printed by child thread");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        System.out.println("This message is printed by parent thread");
    }
}
