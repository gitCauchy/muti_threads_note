package com.cauchy.one;

public class SubThread4 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += 1;
            Thread.yield();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时： " + (end - begin));
    }

    public static void main(String[] args) {
        SubThread4 subThread4 = new SubThread4();
        subThread4.start();
    }
}
