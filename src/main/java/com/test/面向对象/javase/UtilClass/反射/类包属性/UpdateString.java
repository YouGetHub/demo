package com.test.面向对象.javase.UtilClass.反射.类包属性;

import java.lang.reflect.Field;

public class UpdateString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = new String("abc");
        System.out.println(str.hashCode());
        //通过String类获取对应的class
        Class<? extends String> aClass = str.getClass();
        //获取私有属性value
        Field value = aClass.getDeclaredField("value");
        //设置为可以修改私有的值
        value.setAccessible(true);
        //获取value属性里面的值
        char[] chars = (char[]) value.get(str);
        chars[0] = '邹';
        chars[1] = '浩';
        chars[2] = '宇';
        System.out.println(str.hashCode());
        System.out.println(str);
    }
}
