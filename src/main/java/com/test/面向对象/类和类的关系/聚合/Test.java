package com.test.面向对象.类和类的关系.聚合;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("奔驰","黑色",new ChaLun(5,"红色"));
        person.show();
    }
}
