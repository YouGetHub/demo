package com.test.面向对象.类和类的关系.修饰符;

public class Demo1 {
    public void testPublic(){
        System.out.println("我是"+this.getClass()+"的public修饰符方法");
    }
    protected void testprotected(){
        System.out.println("我是"+this.getClass()+"的protected修饰符方法");
    }
    void testDefault(){
        System.out.println("我是"+this.getClass()+"的default修饰符方法");
    }
    private void testprivate(){
        System.out.println("我是"+this.getClass()+"的private修饰符方法");
    }

    public static void main(String[] args) {

    }
}
