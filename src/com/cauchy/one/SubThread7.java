package com.cauchy.one;

public class SubThread7 extends Thread {
    private int stop;

    public SubThread7(int stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.stop; i++) {
            System.out.println(Thread.currentThread().getName() + " -- " + i);
        }
    }

    public static void main(String[] args) {
        SubThread7 subThread7_1 = new SubThread7(10);
        subThread7_1.setDaemon(true);
        SubThread7 subThread7_2 = new SubThread7(1000000);
        subThread7_1.start();
        subThread7_2.start();
    }
}
