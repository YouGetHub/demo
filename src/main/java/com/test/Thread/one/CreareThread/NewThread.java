package com.test.Thread.one.CreareThread;

// extends Thread
public class NewThread extends Thread {
    // 重写run方法 方法体中就是线程要执行的代码
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行了");
    }

    public static void main(String[] args) {
        NewThread t1 = new NewThread();
        t1.setName("t1"); // 设置线程的名字
        t1.start(); // 启动线程

        System.out.println(Thread.currentThread().getName() + "线程执行了");
        /*
         * 当前有mian线程和t1线程同时执行，
         *
         * */
    }
}
