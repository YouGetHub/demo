package com.test.面向对象.类和类的关系.封装;

public class Demo{
    public static void main(String[] args){
        User user = new User();
        user.setName("小兰");
        user.setAge(-1);
        System.out.println(user.getName());
    }
}