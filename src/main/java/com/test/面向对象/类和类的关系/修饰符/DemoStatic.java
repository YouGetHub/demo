package com.test.面向对象.类和类的关系.修饰符;

public class DemoStatic {
    private static int a ;
    private static String str = new String("哈哈");


    public void cc(){
        System.out.println("非静态");
        ccc();
    }
    public static void ccc(){

    }
    public static void cccc(){
    }
    public static void main(String[] args) {
        System.out.println(str);
    }
}
