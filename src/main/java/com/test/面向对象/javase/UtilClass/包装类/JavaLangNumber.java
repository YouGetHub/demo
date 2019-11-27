package com.test.面向对象.javase.UtilClass.包装类;

/*
* 常用的内置基本数据类型 : byte shore int long float double char boolean 等;
java语言为每个内置数据类型提供了对应的包装类：Byte Shore Integer Long Float Double Character Boolean 所有的包装类都是 Number 的子类 Number属于java.lang包
* */
public class JavaLangNumber {

    public static void main(String[] args) {
        print();
    }
    /*
    * Number
    * */
    public static void print(){
        //获取 int 的最小值
        System.out.println("int的最小值" + Integer.MIN_VALUE);
        //获取 int 的最大值
        System.out.println("int的最大值" +Integer.MAX_VALUE);

        //传入 int 类型的10会转为 Integer 类型
        Integer integer = new Integer(10);
        //传入 String 类型的10会转为 Integer 类型 传入的不是数字会报NumberFormatException
        Integer integer1 = new Integer("10");

        Integer integer2 = new Integer(10);
        //Integer 类型转为 int 类型 返回 xxxValue
        int int1  = integer2.intValue();

        //String 类型转为 int 类型 传入的必须是数字字符串
        int i = Integer.parseInt("10");

        //将 int 类型转为Integer类型
        Integer integer3 = Integer.valueOf(10);

        //将String类型转为Integer类型
        Integer integer4 = Integer.valueOf("10");

        //将十进制的10转为2进制
        String string = Integer.toBinaryString(10);
        System.out.println("十进制的10转2进制" + string);

        //十进制的10转为16进制
        String string1 =Integer.toHexString(10);
        System.out.println("十进制的10转换为16进制" +string1);

        //十进制转换为8进制
        String string2 = Integer.toOctalString(10);
        System.out.println("十进制的10转为8进制" + string2);

        //以字符串的形式返回
        Integer integer5 = new Integer(1212);
        String string3 = integer5.toString();
        System.out.println("以字符串的形式返回 "+ string3);

        //用于Number对象与方法的参数做比较 == 为0  >为1 <为-1 可以是一个 Byte, Double, Integer, Float, Long 或 Short 类型的参数。
        Integer integer6  = new Integer(1);
        System.out.println(integer6.compareTo(3));

        //判断Number对象和方法参数是否相等
        Integer integer7 = 5;
        Integer integer8 = 5;
        System.out.println(integer7.equals(integer8));

    }
}
