package com.cauchy.one;

public class SubThread6 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // 判断线程终端标志，使用 isInterrupted() 方法
            if(this.isInterrupted()){
                System.out.println("当前中断标识为 true ,退出。");
                break;
            }
            System.out.println("i --> " + i);
            if(i == 500){
                this.interrupt();
            }

        }
    }

    public static void main(String[] args) {
        SubThread6 subThread6 = new SubThread6();
        subThread6.start();
    }
}
