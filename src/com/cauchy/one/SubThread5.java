package com.cauchy.one;

public class SubThread5 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;

        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + (end - begin));
    }

    public static void main(String[] args) {
        SubThread5 subThread5_1 = new SubThread5();
        subThread5_1.setName("A");
        subThread5_1.setPriority(1);
        SubThread5 subThread5_2 = new SubThread5();
        subThread5_2.setName("B");
        subThread5_2.setPriority(10);
        subThread5_1.start();
        subThread5_2.start();
    }
}
