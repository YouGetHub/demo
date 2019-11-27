package com.test.面向对象.类和类的关系.聚合;

public class Person {
    //车子的特征
    public String name;//名字
    public String color;//颜色
    public ChaLun chaLun;//车轮

    public Person() {
    }

    public Person(String name, String color, ChaLun chaLun) {
        this.name = name;
        this.color = color;
        this.chaLun = chaLun;
    }

    //车的行为
    public void show(){
        System.out.println("一辆"+this.name+"颜色是"+this.color+"车轮的尺寸shi"+chaLun.ciCun+"车轮的颜色"+chaLun.color);
        chaLun.pao();
    }
}
