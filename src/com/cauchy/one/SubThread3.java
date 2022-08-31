package com.cauchy.one;

public class SubThread3 extends Thread{
    @Override
    public void run() {
        System.out.println("run 方法 is Alive" + this.isAlive());
    }

    public static void main(String[] args) {
        SubThread3 subThread3 = new SubThread3();
        subThread3.start();
    }
}
