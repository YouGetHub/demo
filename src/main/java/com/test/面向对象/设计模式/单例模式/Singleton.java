package com.test.面向对象.设计模式.单例模式;
/*
* 让这个类只能创建一个对象
* */
public class Singleton {

    //让构造方法设置私有
    private Singleton() {

    }

    private static Singleton singleton = new Singleton();


    public static Singleton getSingleton(){
        return  singleton;
    }
}
