package com.test.lambda;
/*
* Lambda表达式
* */
public class LambdaDemo1 {

    public static void main(String[] args) {
        //使用Lambda表达式创建对象
        函数式接口 MyInterface = (age)->{ System.out.println("Lambda" + age); return age; };//无参数
        System.out.println(MyInterface.print(23));

        //使用Lambda表达式创建线程  括号里只有一个参数可以省略括号 方法体只有一行代码 可以省略{ }
        new Thread(()->{
            System.out.println("lambda Thread");
        },"thread1").start();
    }
}
