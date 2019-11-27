package com.test.lambda;

/*
 * 函数式接口，在一个接口中只有一个抽象方法，被称为函数式接口
 * */
//@FunctionalInterface //用来标注函数式接口
public interface 函数式接口 {
    public abstract int print(int age);

    /*
    * jdk8中新增了default方法，jdk8之前接口中的方法必须都是抽象的，在jdk8中允许接口中定义非抽象方法，
    * 在接口中的非抽象方法上使用default修饰即可，比如在jdk8中新增了一个函数式接口：java.util.function。
      在接口中定义default方法可以变相的让java支持"多继承"
    * */
    default int print1(int a){
        return a;
    };
}

