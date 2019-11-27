package com.test.面向对象.枚举Runtime;

public class RuntimeDemo {
    public static void main(String[] args) {
        //构造方法被私有了
        Runtime runtime = Runtime.getRuntime();
        //都表示堆内存的空间
        long l = runtime.maxMemory();
        long l1 = runtime.totalMemory();
        long l2 = runtime.freeMemory();
        System.out.println(l);
        System.out.println(l1);
        System.out.println(l2);
    }
}
