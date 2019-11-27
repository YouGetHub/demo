package com.test.面向对象.类和类的关系.抽象类和接口.抽象类;

public class Demo1 extends Demo{
    @Override
    public void eat() {
        System.out.println("我在吃饭");
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.eat();
    }
}
