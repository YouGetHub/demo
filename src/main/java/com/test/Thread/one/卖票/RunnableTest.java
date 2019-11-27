package com.test.Thread.one.卖票;

public class RunnableTest implements Runnable {

    private static int sum = 500;

    private final static int i = 0;

    @Override
    public void run() {
        while (true){
            synchronized (RunnableTest.class){
                sum --;
                if (sum>=i){
                    System.out.println(Thread.currentThread().getName()+"卖了一张还剩"+sum);
                }else {
                    System.out.println("没票了");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        final RunnableTest rt = new RunnableTest();
        Thread t1 = new Thread(rt,"一号窗口");
        Thread t2= new Thread(rt,"二号窗口");
        Thread t3 = new Thread(rt,"三号窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
