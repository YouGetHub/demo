package com.test.面向对象.类和类的关系.依赖;

//这是一个猪类
public class Pig {
    //猪的特征
    public String name;//名字
    public double tizhong = 20;//创建一个猪默认20体重

    public Pig() {
    }

    public Pig(String name, double tizhong) {
        this.name = name;
        this.tizhong = tizhong;
    }
    public Pig(String name) {
        this.name = name;
    }

    //猪增重行为
    public void yang(int a){
        this.tizhong = a*tizhong;
    }


    //猪被杀时的行为
    public void Jiao(){
        System.out.println("啊啊啊"+"一只体重为"+this.tizhong+"公斤的"+this.name+"死了");
    }
}
