package com.test.面向对象.类和对象属性行为;

public class 属性方法 {
    //描述事物的状态
//权限修饰符  参数类型 名字
    public String name;//全局变量
    public char sex;

    //描述事物的行为
//权限修饰符 返回值  方法名
    public void chiFan(){
        //this指当前对象，调用这个方法的对象
        System.out.println(this.name+"吃饭");
    }
    //无参有返回值
    public String getName(){
        return this.name;//方法执行完后得到的一个结果
    }
    //有参有返回值
    public String setName(String name){
        this.name = name;
        return this.name;//方法执行完后得到的一个结果
    }
}
class Demo{
    public static void main(String[] args) {
        //实例对象 ，一个人类的对象
        属性方法 test = new 属性方法();
        test.setName("小兰");
        test.sex = '男';
        //调用人类的相同之处，吃饭
        test.chiFan();
        System.out.println(test.getName());

        //实例对象.可以创建多个对象的实例，一个人类的对象
        属性方法 test1 = new 属性方法();
        test1.setName("萨摩耶");
        test1.sex = '男';
        //调用人类的相同之处，吃饭
        test1.chiFan();
    }
}
