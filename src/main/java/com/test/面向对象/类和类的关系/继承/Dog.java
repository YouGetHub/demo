package com.test.面向对象.类和类的关系.继承;

public class Dog {
    public Dog() {
        System.out.println("我是父类");
    }
    static {
        System.out.println("父类的静态代码块");
    }
    {
        System.out.println("父类的代码块");
    }

    public String name;

    public void eat(){
        System.out.println(this.name+"吃饭");
    }

    public void sleep(){
        System.out.println(this.name +" 睡觉");
    }
}
