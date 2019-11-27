package com.test.面向对象.类和类的关系.依赖;

//描述屠夫的刀
public class PersonDao {
    //描述屠夫的刀
    public String name;//名字
    public int daolength;//长度

    public PersonDao() {
    }

    public PersonDao(String name, int daolength) {
        this.name = name;
        this.daolength = daolength;
    }

    //刀的行为
    public void dong() {
        System.out.println("拿起了一把长" + this.daolength + "米的" + this.name + "挥动了起来");
    }
}
