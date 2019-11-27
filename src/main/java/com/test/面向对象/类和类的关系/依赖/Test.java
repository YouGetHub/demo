package com.test.面向对象.类和类的关系.依赖;
//测试类
public class Test {
    public static void main(String[] args) {
        //农夫对象，农夫开始创建猪和养猪
        NongFu nongFu = new NongFu(new Pig("小兰猪"));
        //农夫养猪
        nongFu.yang(4);
        //创建屠夫对象
        Person person = new Person("小明",new PersonDao("屠龙宝刀",10));
        //屠夫杀猪
        person.sha(nongFu.pig);
    }
}
