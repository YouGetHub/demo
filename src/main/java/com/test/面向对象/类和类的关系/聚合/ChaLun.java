package com.test.面向对象.类和类的关系.聚合;

public class ChaLun {
    //车轮的特征
    public double ciCun;//尺寸
    public String color;//颜色

    public ChaLun() {
    }

    public ChaLun(double ciCun, String color) {
        this.ciCun = ciCun;
        this.color = color;
    }

    //车轮的行为
    public void pao(){
        System.out.println("车轮在高速的旋转");
    }
}
