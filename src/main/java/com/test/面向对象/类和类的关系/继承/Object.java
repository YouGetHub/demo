package com.test.面向对象.类和类的关系.继承;

public class Object {
    public static void main(String[] args) throws Throwable {
        Object object = new Object();
        //默认比较的是地址
        boolean equals = object.equals(object);

        //将对象变成字符串，
        String s = object.toString();

        //获取对象对应类的映射
        Class<? extends Object> aClass = object.getClass();
        System.out.println(aClass);

        //将线程进入等待状态
        object.wait();

        //唤醒线程
        object.notify();

        //唤醒所有
        object.notifyAll();

        //在对象被 回收的时候GC默认调用的方法
        object.finalize();

        //克隆对象
        java.lang.Object clone = object.clone();

    }
}
