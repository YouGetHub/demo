package com.test.Thread.one.卖票;

public class WindowTest extends Thread {
    private String ThreadName;

    public WindowTest(String threadName) {
        ThreadName = threadName;
    }

    private static int sum = 5;
    @Override
    public void run() {
        while (true){
           synchronized (WindowTest.class){
               sum--;
               if (sum>=0){
                       System.out.println(this.ThreadName+"卖了一张还剩"+sum);
               }else{
                   System.out.println(this.ThreadName+"窗口没票了");
                   break;
               }
           }
        }
    }

    public static void main(String[] args) {
        WindowTest t1 = new WindowTest("小明");
        WindowTest t2 = new WindowTest("校长");
        WindowTest t3 = new WindowTest("小刚");
        t1.start();
        t2.start();
        t3.start();
    }
}