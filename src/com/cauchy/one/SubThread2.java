package com.cauchy.one;

public class SubThread2 extends Thread{
    public SubThread2(){
        System.out.println("构造方法中，Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("构造方法中，this.getName(): " + this.getName());
    }

    @Override
    public void run() {
        System.out.println("run 方法中，Thread.currentThread().getName(): " + Thread.currentThread().getName());
        System.out.println("run 方法中，this.getName(): " + this.getName());
    }

    public static void main(String[] args) {
        SubThread2 subThread2 = new SubThread2();
        subThread2.start();
    }
}
