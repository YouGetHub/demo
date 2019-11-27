package com.test.面向对象.类和类的关系.多态;

public class Teacher extends Person {
    @Override
    public void eat() {
        System.out.println("teacher老师在吃饭");
    }

    public void load() {
        System.out.println("老师的方法");
    }
}
