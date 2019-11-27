package com.test.面向对象.类和对象属性行为;

public class Person {
    public String name;
    public int age;
    //无参数构造方法
    public Person(){
        System.out.println("我是无参");
    }
    //有参的构造方法
    public Person(String name, int age) {
        this();
        //this 代表当前调用这个方法的对象
        this.name = name;
        this.age = age;
    }
    //代码块
    {
        System.out.println("写一些创建对象之前的做的事情");
    }
}
class Test {
    public static void main(String[] args) {
       //在创建对象的同时，初始化属性
       Person p =  new Person("小兰",18);

       //先初始化对象，后初始化属性
       Person p1 = new Person();
       p.name = "小紫";
       p.age = 20;
    }
}