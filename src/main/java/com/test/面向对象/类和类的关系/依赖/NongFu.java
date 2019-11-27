package com.test.面向对象.类和类的关系.依赖;

//农夫专门用来养猪
public class NongFu {

    public Pig pig;

    public NongFu(Pig pig) {
        this.pig = pig;
    }

    public Pig yang(int a){
        //创建猪类
        //开始增肥
        pig.yang(a);
        return pig;
    }

}
